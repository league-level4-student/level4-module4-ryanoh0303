package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
	protected int y;
	int height;
	int width ;
	//should I initialize it to 50?
    Polymorph(int x, int y, int height, int width){
   	 this.x = x;
   	 this.y = y;
   	 this.height = height;
   	 this.width = width;
    }
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public void setX(int j) {
    	 x = j;
    }
    public void setY(int j) {
    	y= j;
    }
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int i) {
		width = i;
	}
	public void setHeight(int i) {
		height = i;
	}
   
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
