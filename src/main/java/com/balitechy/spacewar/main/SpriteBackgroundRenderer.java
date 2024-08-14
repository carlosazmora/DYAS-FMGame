package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteBackgroundRenderer implements BackgroundRenderer{

	private BufferedImage background;

	public SpriteBackgroundRenderer (Game game) {
		SpritesImageLoader bgLoader = new SpritesImageLoader("/bg.png");
		this.background = bgLoader.getImage(0, 0, 640, 480);
	}

	@Override
	public void renderBackground(Graphics g, Canvas c) {
		g.drawImage(this.background, 0, 0, c.getWidth(), c.getHeight(), c);
	}
}
