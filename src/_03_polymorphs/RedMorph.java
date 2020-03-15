package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph {

	RedMorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, height, width);
	}
	
}
