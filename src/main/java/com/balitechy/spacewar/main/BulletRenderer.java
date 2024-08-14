package com.balitechy.spacewar.main;

import java.awt.*;
import java.util.LinkedList;

public interface BulletRenderer {
    void renderBullet(Graphics g, LinkedList<Bullet> bullets);
}
