package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Mouse extends Polymorph {

	Mouse(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
		
	}
	public void update(int x, int y) {
		
		
	}

}
