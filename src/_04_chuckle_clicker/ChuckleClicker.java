package _04_chuckle_clicker;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {
	
public static void main(String[] args) {
	makeButtons();
}
static void makeButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	frame.add(panel);
	panel.add(button);
	panel.add(button1);
	button.setText("Joke");
	button1.setText("Punchline");
	button.setPreferredSize(new Dimension(200,100));
	button1.setPreferredSize(new Dimension(200,100));
    frame.setVisible(true);
}
}
