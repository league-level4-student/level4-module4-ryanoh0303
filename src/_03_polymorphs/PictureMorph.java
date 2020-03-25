package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class PictureMorph extends Polymorph{
	boolean needImage = true;
	boolean gotImage = false;
	Image image;
	PictureMorph(int x, int y, int height, int width) {
		super(x, y, height, width);
		if (needImage) {
		    loadImage ("body.png");
		}
	}

	@Override
	public void draw(Graphics g) {		
		
		g.drawImage(image, x, y , height, width, null);
	}
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	            gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	
}
