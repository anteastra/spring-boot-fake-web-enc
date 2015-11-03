package com.fakewebencoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by ILisetskiy on 03.11.2015.
 */
public class FakeEncoderUtils {

    public static byte[] generateImage(String text) {
        BufferedImage image = new BufferedImage(300, 200, BufferedImage.TYPE_INT_RGB); // 123 wide, 123 tall
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.drawString(text, 20, Math.round(Math.random()*200));
        graphics2D.dispose();

        byte[] imageInByte = null;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "jpg", baos);
            baos.flush();
            imageInByte = baos.toByteArray();
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return imageInByte;
    }
}
