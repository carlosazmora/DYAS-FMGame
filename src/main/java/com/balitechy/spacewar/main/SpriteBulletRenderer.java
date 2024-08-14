package com.balitechy.spacewar.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class SpriteBulletRenderer implements BulletRenderer{
    private BufferedImage image;


    public SpriteBulletRenderer(Game game) {
        SpritesImageLoader sprites = new SpritesImageLoader("/sprites.png");
        this.image = sprites.getImage(35, 52, Bullet.WIDTH, Bullet.HEIGHT);
    }

    @Override
    public void renderBullet(Graphics g, LinkedList<Bullet> bullets) {
        for (Bullet bullet : bullets) {
            g.drawImage(image, (int) bullet.getX(), (int) bullet.getY(), null);
        }
    }
}
