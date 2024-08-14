package com.balitechy.spacewar.main;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SpritePlayerRenderer implements PlayerRenderer {
    private BufferedImage image;

    public SpritePlayerRenderer(Game game) {
        SpritesImageLoader sprites = new SpritesImageLoader("/sprites.png");
        this.image = sprites.getImage(219, 304, Player.WIDTH, Player.HEIGHT);
    }

    @Override
    public void renderPlayer(Graphics g, double x, double y) {
        g.drawImage(image, (int) x, (int) y, null);
    }

}
