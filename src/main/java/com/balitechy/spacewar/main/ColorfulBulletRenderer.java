package com.balitechy.spacewar.main;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ColorfulBulletRenderer implements BulletRenderer {

    @Override
    public void renderBullet(Graphics g, ArrayList<Bullet> bullets) {
        for (int i=0; i < bullets.size(); i++) {
            g.setColor(Color.RED);
            g.fillRect((int) bullets.get(i).getX(), (int) bullets.get(i).getY(), Bullet.WIDTH, Bullet.HEIGHT);
        }
    }
}
