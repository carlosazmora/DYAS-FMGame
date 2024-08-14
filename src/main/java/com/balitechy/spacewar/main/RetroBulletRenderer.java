package com.balitechy.spacewar.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class RetroBulletRenderer implements BulletRenderer {

    @Override
    public void renderBullet(Graphics g, LinkedList<Bullet> bullets) {
        for (Bullet bullet : bullets) {
            g.setColor(Color.WHITE);
            g.fillRect((int) bullet.getX(), (int) bullet.getY(), Bullet.WIDTH, Bullet.HEIGHT);
        }
    }
}
