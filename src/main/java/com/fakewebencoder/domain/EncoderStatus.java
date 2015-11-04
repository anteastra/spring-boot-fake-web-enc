package com.fakewebencoder.domain;

/**
 * Created by ILisetskiy on 03.11.2015.
 */
public class EncoderStatus {

    private Boolean isEncoding;
    private Double ramUsage;
    private Double ramTotal;
    private Double cpuUsage;
    public EncoderStatus(Boolean isEncoding, Double ramUsage, Double ramTotal, Double cpuUsage) {
        this.isEncoding = isEncoding;
        this.ramUsage = ramUsage;
        this.ramTotal = ramTotal;
        this.cpuUsage = cpuUsage;
    }

    public Double getRamUsage() {
        return ramUsage;
    }

    public void setRamUsage(Double ramUsage) {
        this.ramUsage = ramUsage;
    }

    public Double getRamTotal() {
        return ramTotal;
    }

    public void setRamTotal(Double ramTotal) {
        this.ramTotal = ramTotal;
    }

    public Double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public Boolean getIsEncoding() {
        return isEncoding;
    }

    public void setIsEncoding(Boolean isEncoding) {
        this.isEncoding = isEncoding;
    }
}
