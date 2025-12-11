package JField_Java;

import javax.swing.JFrame;

public class FillShapedMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Fill Shaped Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(new FillShaped());
		frame.setVisible(true);
	}

}
