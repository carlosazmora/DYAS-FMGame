package com.balitechy.spacewar.main;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpritesImageLoader {
	
	private String path;
	private BufferedImage image;
	
	public SpritesImageLoader(String path){
		this.path = path;
        try {
            loadImage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
	
	public void loadImage() throws IOException{
		image = ImageIO.read(getClass().getResource(path));
	}
	
	public BufferedImage getImage(int top, int left, int width, int height){
		BufferedImage img = image.getSubimage(top, left, width, height);
		return img;
	}
}
