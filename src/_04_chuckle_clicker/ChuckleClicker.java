package _04_chuckle_clicker;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
public static void main(String[] args) {
	ChuckleClicker chuckle = new ChuckleClicker();
	chuckle.makeButtons();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();

void makeButtons() {
		frame.add(panel);
	panel.add(button);
	panel.add(button1);
	button.setText("Joke");
	button1.setText("Punchline");
	button.setPreferredSize(new Dimension(200,100));
	button1.setPreferredSize(new Dimension(200,100));
    frame.setVisible(true);
    button.addActionListener(this);
    button1.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed == button){
		JOptionPane.showMessageDialog(null, "Joe");
	}
	 if (buttonPressed == button1) {
		JOptionPane.showMessageDialog(null, "Mama");
	}
	
}
}
