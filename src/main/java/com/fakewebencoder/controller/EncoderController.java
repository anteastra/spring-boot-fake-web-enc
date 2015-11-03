package com.fakewebencoder.controller;

import com.fakewebencoder.FakeEncoderUtils;
import com.fakewebencoder.domain.FakeEncoder;
import com.fakewebencoder.domain.Settings;
import com.fakewebencoder.domain.Status;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sun.misc.IOUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ILisetskiy on 03.11.2015.
 */

// getStatus
// setSource
// getSource
// setOutput
// getOutput
// start
// stop
// setSettings
// getSettings

@RestController
public class EncoderController {

    private FakeEncoder encoder = new FakeEncoder(new Settings(), new Status(false), null, null);

    @RequestMapping("/status")
    public Status getStatus() {
        return encoder.getStatus();
    }

    @ResponseBody
    @RequestMapping(value = "/source/preview", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] testPreviewInput() throws IOException {
        return FakeEncoderUtils.generateImage("source");
    }

    @ResponseBody
    @RequestMapping(value = "/output/preview", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] testPreviewOutput() throws IOException {
        return FakeEncoderUtils.generateImage("output");
    }


}
