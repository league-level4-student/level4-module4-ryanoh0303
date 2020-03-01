package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
	protected int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
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
   
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
