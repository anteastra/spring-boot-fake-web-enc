package com.fakewebencoder.controller;

import com.fakewebencoder.domain.*;
import com.fakewebencoder.utils.FakeEncoderUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by ILisetskiy on 03.11.2015.
 */

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

    private FakeEncoder encoder = new FakeEncoder(new EncoderSettings(), null, null, null);

    @RequestMapping("/status")
    public EncoderStatus getEncoderStatus() {
        System.out.println("get encoder status");
        encoder.generateStatus();
        return encoder.getStatus();
    }

    @RequestMapping("/start")
    public EncoderStatus startEncoder() {
        System.out.println("start encoder");
        encoder.start();
        return encoder.getStatus();
    }

    @RequestMapping("/stop")
    public EncoderStatus stopEncoder() {
        System.out.println("stop encoder");
        encoder.stop();
        return encoder.getStatus();
    }

    @ResponseBody
    @RequestMapping(value = "/source/preview", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] testPreviewInput() throws IOException {
        System.out.println("get source preview");
        if (encoder.getSource() != null) {
            return FakeEncoderUtils.generateImage("source");
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/output/preview", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] testPreviewOutput() throws IOException {
        System.out.println("get output preview");
        if (encoder.getStatus().getIsEncoding()) {
            return FakeEncoderUtils.generateImage("output");
        }
        return null;
    }

    @RequestMapping(value = "/settings", method = RequestMethod.GET)
    public EncoderSettings getEncoderSettings() {
        System.out.println("get encoder settings");
        return encoder.getSettings();
    }

    @RequestMapping(value = "/settings", method = RequestMethod.POST)
    EncoderSettings setSettings(@RequestBody EncoderSettings input) {
        encoder.setSettings(input);
        return encoder.getSettings();
    }

    @RequestMapping(value = "/source", method = RequestMethod.GET)
    public Source getEncoderSource() {
        System.out.println("get encoder source");
        return encoder.getSource();
    }

    @RequestMapping(value = "/source", method = RequestMethod.POST)
    Source setSource(@RequestBody Source input) {
        encoder.setSource(input);
        return encoder.getSource();
    }

    @RequestMapping(value = "/output", method = RequestMethod.GET)
    public Output getEncoderOutput() {
        System.out.println("get encoder output");
        return encoder.getOutput();
    }

    @RequestMapping(value = "/output", method = RequestMethod.POST)
    Output setOutput(@RequestBody Output input) {
        encoder.setOutput(input);
        return encoder.getOutput();
    }
}
