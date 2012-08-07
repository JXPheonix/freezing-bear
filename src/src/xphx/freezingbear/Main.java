package xphx.freezingbear;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	//this is probably the worst code ever
	
	boolean banana = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main mainification = new Main(); //it's been mainified!
		mainification.FreezeTheBear(); //i don't like static classes >:(

	}

	private void FreezeTheBear() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Freeze the bear");
		button.setToolTipText("But you can't freeze a polar bear!");
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
		banana = true;
	}

}
