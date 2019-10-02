package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinGenerator implements ActionListener {
	JLabel label = new JLabel();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField text = new JTextField();
public static void main(String[] args) {
	PigLatinGenerator pig = new PigLatinGenerator();
	pig.stuff();
}
void stuff(){
	frame.add(panel);
	panel.add(button);
	panel.add(label);
	panel.add(text);
	label.setPreferredSize(new Dimension(250,250));
	frame.setSize(1000,1000);
	button.setPreferredSize(new Dimension(250,250));
	button.setText("TRANSLATE");
	button.addActionListener(this);
	text.setPreferredSize(new Dimension(250,250));
	frame.setVisible(true);
	frame.pack();
	
	
		
	
}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	PigLatinRunner translate1 = new PigLatinRunner();
	String translate2 = translate1.translate(text.getText());
	label.setText(translate2);
}
}

