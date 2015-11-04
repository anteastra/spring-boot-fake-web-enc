package com.fakewebencoder.domain;

/**
 * Created by ILisetskiy on 03.11.2015.
 */
public class FakeEncoder {

    private EncoderSettings settings;
    private EncoderStatus status;
    private Source source;
    private Output output;

    public EncoderSettings getSettings() {
        return settings;
    }

    public void setSettings(EncoderSettings settings) {
        this.settings = settings;
    }

    public EncoderStatus getStatus() {
        return status;
    }

    public void setStatus(EncoderStatus status) {
        this.status = status;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public FakeEncoder(EncoderSettings settings, EncoderStatus status, Source source, Output output) {

        this.settings = settings;
        this.status = status;
        this.source = source;
        this.output = output;

        if (getStatus() == null) {
            setStatus(new EncoderStatus(false, 8.0, 20.0, 32.0));
        }
    }

    public void generateStatus() {

        double ramUsage = 40.0;
        double cpuUsage = 20.0;

        if (status.getIsEncoding()) {
            ramUsage = 80.0;
            cpuUsage = 70.0;
        }

        ramUsage = (Math.random()*20-20)*ramUsage/100 + ramUsage;
        cpuUsage = (Math.random()*10-10)*cpuUsage/100 + cpuUsage;

        status.setRamTotal(8.0);
        status.setRamUsage(ramUsage);
        status.setCpuUsage(cpuUsage);
    }

    public void start() {
        status.setIsEncoding(true);
    }

    public void stop() {
        status.setIsEncoding(false);
    }
}
