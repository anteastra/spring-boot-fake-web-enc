package com.fakewebencoder.domain;

/**
 * Created by ILisetskiy on 03.11.2015.
 */
public class EncoderSettings {
    private String codec;
    private Integer width;
    private Integer height;

    public EncoderSettings() {
        codec = "HEVC";
        width = 1920;
        height = 1080;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public EncoderSettings(String codec, Integer width, Integer height) {

        this.codec = codec;
        this.width = width;
        this.height = height;
    }
}
