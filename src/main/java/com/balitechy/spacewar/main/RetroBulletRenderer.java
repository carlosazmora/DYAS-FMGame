package com.balitechy.spacewar.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class RetroBulletRenderer implements BulletRenderer {

    @Override
    public void renderBullet(Graphics g, ArrayList<Bullet> bullets) {
        for(int i=0; i < bullets.size(); i++){
            g.setColor(Color.WHITE);
            g.fillRect((int) bullets.get(i).getX(), (int) bullets.get(i).getY(), Bullet.WIDTH, Bullet.HEIGHT);
        }
    }
}
