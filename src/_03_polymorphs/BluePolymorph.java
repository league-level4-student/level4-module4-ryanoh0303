package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	

	BluePolymorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void draw(Graphics g) {
		height = getHeight();
		width = getWidth();
		g.setColor(Color.BLUE);
		g.fillRect(x, y, height, width);
	}
	public void update() {

	}
	
}
