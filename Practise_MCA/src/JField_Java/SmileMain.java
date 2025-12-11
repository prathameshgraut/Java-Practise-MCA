package JField_Java;

import javax.swing.JFrame;

public class SmileMain {

	public static void main(String[] args) {
		JFrame jf = new JFrame("Smile");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500,500);
		jf.add(new SmileFace());
		jf.setVisible(true);

	}

}
