package com.balitechy.spacewar.main;

import java.awt.*;
import java.awt.image.BufferedImage;

public class RetroBackgroundRenderer implements BackgroundRenderer {
	@Override
	public void renderBackground(Graphics g, Canvas c) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, c.getWidth(), c.getHeight());

		int moonDiameter = 200;
		int moonX = -moonDiameter/2;
		int moonY = -moonDiameter/2;

		g.setColor(Color.GRAY);
		g.fillOval(moonX, moonY, moonDiameter, moonDiameter);

		g.setColor(Color.WHITE);
		g.drawOval(moonX, moonY, moonDiameter, moonDiameter);
	}
}
