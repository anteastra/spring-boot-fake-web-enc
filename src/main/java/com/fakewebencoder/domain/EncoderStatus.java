package com.fakewebencoder.domain;

/**
 * Created by ILisetskiy on 03.11.2015.
 */
public class EncoderStatus {

    private Boolean isEncoding;
    private Boolean isConnected;
    private Double ramUsage;
    private Double ramTotal;
    private Double cpuUsage;
    public EncoderStatus(Boolean isEncoding, Boolean isConnected, Double ramUsage, Double ramTotal, Double cpuUsage) {
        this.isEncoding = isEncoding;
        this.isConnected = isConnected;
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

    public Boolean getIsConnected() {
        return isConnected;
    }

    public void setIsConnected(Boolean isConnected) {
        this.isConnected = isConnected;
    }
}
