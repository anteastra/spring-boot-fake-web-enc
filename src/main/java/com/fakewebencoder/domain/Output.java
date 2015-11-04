package com.fakewebencoder.domain;

/**
 * Created by ILisetskiy on 03.11.2015.
 */
public class Output {
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Output(String path) {

        this.path = path;
    }

    private String path;
}
