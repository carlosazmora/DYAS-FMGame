package com.balitechy.spacewar.main;

import java.awt.*;
import java.awt.image.BufferedImage;

public class RetroPlayerRenderer implements PlayerRenderer {

    @Override
    public void renderPlayer(Graphics g, double x, double y) {
        g.setColor(Color.WHITE);

        int[] xPoints = {
                (int) x + Player.WIDTH / 2,
                (int) x,
                (int) x + Player.WIDTH
        };

        int[] yPoints = {
                (int) y,                    // Punta superior del triángulo
                (int) y + Player.HEIGHT,    // Esquina inferior izquierda
                (int) y + Player.HEIGHT     // Esquina inferior derecha
        };

        int nPoints = xPoints.length;

        g.fillPolygon(xPoints, yPoints, nPoints);

    }
}

