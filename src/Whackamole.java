import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whackamole {
	
	public static void main(String[] args) {
Whackamole a = new Whackamole();
		a.drawButtons();
	}
	Random rand = new Random();	
	void drawButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		
		int rand1 = rand.nextInt(23);
	for (int i = 0; i < 23; i++) {
		
		
	

	JButton button  = new JButton();
	panel.add(button);
	button.setText(i + "");
	}
}
}
