package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	MovingMorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void draw(Graphics g) {
		height = getHeight();
		width = getWidth();
		g.setColor(Color.BLACK);
		g.fillRect(x,y,width, height);
		
	}
	public void update() {
		if(x>0) {
			x=x-1;
		}
		else {
			x = 500;
		}
		if(y>0) {
			y=y-1;
		}
		else {
			y = 500;
		}
	}

}
