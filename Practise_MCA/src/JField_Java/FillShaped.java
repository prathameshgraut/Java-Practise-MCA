package JField_Java;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FillShaped extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		//react
//		g.setColor(Color.BLUE);
//		g.fillRect(200, 300, 500, 350);
//		
//		
//		//arc
//		g.setColor(Color.yellow);
//		g.fillArc(180, 200, 500, 300, 0, 80);
//
//		//circle
//		g.setColor(Color.green);
//		g.fillOval(140, 140, 200, 200);
		
//		//paintMode
//		g.setPaintMode();
//		g.setColor(Color.blue);
//		g.fillArc(20, 150,150, 100, 0, 180);
		
		
		//Print Different type of Font
		g.setFont(new Font("Serif",Font.BOLD,24));
		g.drawString("Prathamesh", 20, 40);
		
		
		g.setFont(new Font("Serif",Font.ITALIC,24));
		g.drawString("Prathamesh", 20, 50);
	}
}
