package JField_Java;

import java.awt.Graphics;

import javax.swing.JPanel;

public class BasicGraphic extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Line
		g.drawLine(20, 20, 200, 20);
		
		//Oval
		g.drawOval(200,50,120,80);
		
		//Rectangle
		g.drawRect(20, 50, 150, 80);
		
		//circle
		g.drawOval(350, 50, 80, 80);
		
		//ARC
		g.drawArc(20, 150, 150, 100, 0, 80);
	}
}
