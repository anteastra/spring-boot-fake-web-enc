package com.fakewebencoder.domain;

/**
 * Created by ILisetskiy on 03.11.2015.
 */
public class FakeEncoder {

    private Settings settings;
    private Status status;
    private Source source;
    private Output output;

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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

    public FakeEncoder(Settings settings, Status status, Source source, Output output) {

        this.settings = settings;
        this.status = status;
        this.source = source;
        this.output = output;
    }
}