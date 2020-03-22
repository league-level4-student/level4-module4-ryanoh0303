package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Polymorph{
	int initX;
	int initY;
	double temp= 0;
	Circle(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillOval(x, y, width, height);
		g.drawOval(x, y, width, height);
	    initX =x;
		initY = y;
	  
	}
	public void update() {
		int radius  = 20;
		
		//x = centerX + (int(radius*cos(path))\
		//Y = centerY + (int(radius*sin(path))

		x =  initX+(int) (radius*Math.cos(temp));
		y = initY+ (int) (radius*Math.sin(temp));
		
		temp += 0.5;
	
	}

}
