import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton();
	int score;
	
	public static void main(String[] args) {
		 JOptionPane.showMessageDialog(null, "Hit the mole 10 times to win.");
Whackamole a = new Whackamole();
		a.drawButtons();
	}
	Random rand = new Random();	
	void drawButtons() {
		panel = new JPanel();
		frame.setVisible(true);
		
		frame.add(panel);
		
		int rand1 = rand.nextInt(23);
	for (int i = 0; i < 23; i++) {
		
	if (i == rand1) {
		mole = new JButton("Mole");
		mole.addActionListener(this);
		panel.add(mole);
	}
	else {
	
	JButton button  = new JButton();
	button.addActionListener(this);
	panel.add(button);
	button.setText("");
	}
	}
}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == mole) {
			score++;
		speak("YOU HIT THE MOLE");
		frame.remove(panel);
		drawButtons();
		 if (score == 10) {
			 frame.dispose();
			 JOptionPane.showMessageDialog(null, "Game Over");
		 }
		}
		else {
			speak("thats not. mole?");
		}
		
	}
}
