package com.balitechy.spacewar.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;

public class SpriteBulletRenderer implements BulletRenderer{
    private BufferedImage image;


    public SpriteBulletRenderer(Game game) {
        SpritesImageLoader sprites = new SpritesImageLoader("/sprites.png");
        this.image = sprites.getImage(35, 52, Bullet.WIDTH, Bullet.HEIGHT);
    }

    @Override
    public void renderBullet(Graphics g, ArrayList<Bullet> bullets) {
        for(int i=0; i < bullets.size(); i++){
            g.drawImage(image, (int) bullets.get(i).getX(), (int) bullets.get(i).getY(), null);
        }
    }
}
