package com.fakewebencoder.domain;

/**
 * Created by ILisetskiy on 03.11.2015.
 */
public class Status {

    private Boolean isEncoding;

    public Boolean getIsEncoding() {
        return isEncoding;
    }

    public Status(Boolean isEncoding) {

        this.isEncoding = isEncoding;
    }
}
