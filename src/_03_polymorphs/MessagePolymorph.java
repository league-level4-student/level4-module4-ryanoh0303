package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MessagePolymorph extends Polymorph {

	MessagePolymorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, height, width);
	}
	public void update() {
		
	}

}
