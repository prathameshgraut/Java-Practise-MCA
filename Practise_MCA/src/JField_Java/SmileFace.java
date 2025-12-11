package JField_Java;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SmileFace extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		//circle
		g.setColor(Color.yellow);
		g.fillOval(50, 50, 200, 200);
		
		g.setColor(Color.BLACK);
		g.drawOval(50, 50, 200, 200);
		
		//Eyes
		g.fillOval(100, 110, 20, 30);
		g.fillOval(180, 110, 20, 30);
		
		//Arc(Smile)
		g.drawArc(100, 130, 100, 80, 0, -180);
		
	}

}
