package de.polygondev.re.ctrl;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RoomObject {

    public int x = 0;
    public int y = 0;
    public int w = 0;
    public int h = 0;

    public String name = "";

    public String spritePath = "";

    public BufferedImage img = null;

    public RoomObject(String name, int x, int y, int w, int h, String spritePath) {

        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.spritePath = spritePath;

        if (!spritePath.equalsIgnoreCase("")) {
            try {
                img = ImageIO.read(new File(spritePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
