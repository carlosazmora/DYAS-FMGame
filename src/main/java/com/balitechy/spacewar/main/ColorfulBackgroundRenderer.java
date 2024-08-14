package com.balitechy.spacewar.main;

import java.awt.*;

public class ColorfulBackgroundRenderer implements BackgroundRenderer {
	@Override
	public void renderBackground(Graphics g, Canvas c) {

		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, c.getWidth(), c.getHeight());

		int moonDiameter = 200;
		int moonX = -moonDiameter/2;
		int moonY = -moonDiameter/2;

		g.setColor(Color.YELLOW);
		g.fillOval(moonX, moonY, moonDiameter, moonDiameter);

		g.setColor(Color.WHITE);
		g.drawOval(moonX, moonY, moonDiameter, moonDiameter);
	}
}
