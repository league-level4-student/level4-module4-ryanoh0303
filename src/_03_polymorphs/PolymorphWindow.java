package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    //Polymorph bluePoly;
    //Polymorph redPoly;
    ArrayList<Polymorph> arr;

    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.addMouseListener(this);
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 arr = new ArrayList<>();
   	 arr.add(new RedMorph(50,50,100,100));
   	 arr.add(new Circle(250,20, 50,50));
   	 arr.add(new MovingMorph(50,50,100,100));
   	 //arr.add(new BluePolymorph(50,300,200,200));
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();                   
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   // bluePoly.draw(g);
   	// redPoly.draw(g);
   	 for(int i=0; i<arr.size(); i++) {
   		 arr.get(i).draw(g);
   	 }
   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   //	 bluePoly.update();
   	 for(int i=0; i<arr.size(); i++) {
   		 arr.get(i).update();
   	 }

    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
