package com.fakewebencoder.controller;

import com.fakewebencoder.utils.FakeEncoderUtils;
import com.fakewebencoder.domain.FakeEncoder;
import com.fakewebencoder.domain.Settings;
import com.fakewebencoder.domain.EncoderStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by ILisetskiy on 03.11.2015.
 */

// addEncoder
// updateEncoder
// deleteEncoder
// getEncodersList
//
// addSource
// updateSource
// deleteSource
// getSourcesList
//
// addOutput
// updateOutput
// deleteOutput
// getOutputsList
//
// getSourcePreview
// getOutputPreview
//
// getEncoderStatus
// setEncoderSource
// getEncoderSource
// setEncoderOutput
// getEncoderOutput
// startEncoder
// stopEncoder
// setEncoderSettings
// getEncoderSettings

@RestController
public class EncoderController {

    private FakeEncoder encoder = new FakeEncoder(new Settings(), null, null, null);

    @RequestMapping("/encoder/{id}/status")
    public EncoderStatus getEncoderStatus(@PathVariable String id) {
        System.out.println("get encoder status with id " + id);
        encoder.generateStatus();
        return encoder.getStatus();
    }

    @RequestMapping("/encoder/{id}/start")
    public EncoderStatus startEncoder(@PathVariable String id) {
        System.out.println("start encoder with id " + id);
        encoder.start();
        return encoder.getStatus();
    }

    @RequestMapping("/encoder/{id}/stop")
    public EncoderStatus stopEncoder(@PathVariable String id) {
        System.out.println("stop encoder with id " + id);
        encoder.stop();
        return encoder.getStatus();
    }

    @ResponseBody
    @RequestMapping(value = "/source/{id}/preview", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] testPreviewInput(@PathVariable String id) throws IOException {
        System.out.println("get source preview with id " + id);
        return FakeEncoderUtils.generateImage("source");
    }

    @ResponseBody
    @RequestMapping(value = "/output/{id}/preview", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] testPreviewOutput(@PathVariable String id) throws IOException {
        System.out.println("get output preview with id " + id);
        return FakeEncoderUtils.generateImage("output");
    }


}
