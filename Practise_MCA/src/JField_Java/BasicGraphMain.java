package JField_Java;

import javax.swing.JFrame;

public class BasicGraphMain {

	public static void main(String[] args) {
		JFrame jf = new JFrame("Basic Graph Demo");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500,500);
		jf.add(new BasicGraphic());
		jf.setVisible(true);
	}

}
