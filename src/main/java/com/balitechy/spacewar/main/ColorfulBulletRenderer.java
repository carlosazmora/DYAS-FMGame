package com.balitechy.spacewar.main;

import java.awt.*;
import java.util.LinkedList;

public class ColorfulBulletRenderer implements BulletRenderer {

    @Override
    public void renderBullet(Graphics g, LinkedList<Bullet> bullets) {
        for (Bullet bullet : bullets) {
            g.setColor(Color.RED);
            g.fillRect((int) bullet.getX(), (int) bullet.getY(), Bullet.WIDTH, Bullet.HEIGHT);
        }
    }
}
