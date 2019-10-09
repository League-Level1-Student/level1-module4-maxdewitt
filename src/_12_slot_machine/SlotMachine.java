package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
public static void main(String[] args) {
	SlotMachine slots = new SlotMachine();
	int wins=0;
	slots.stuff();
}
int wins;
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JLabel slot1 = new JLabel();
JLabel slot2 = new JLabel();
JLabel slot3 = new JLabel();
JLabel victorycounter = new JLabel();
void stuff(){
	//Setup
	frame.add(panel);
	panel.add(button);
	panel.add(slot1);
	panel.add(slot2);
	panel.add(slot3);
	panel.add(victorycounter);
	button.addActionListener(this);
	//Visuals
	frame.setVisible(true);
    button.setText("SPIN!");
    slot1.setText("---");
    slot2.setText("---");
    slot3.setText("---");
    
    
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	Random rand = new Random();
	int rand1 = rand.nextInt(3);
	int rand2 = rand.nextInt(3);
	int rand3 = rand.nextInt(3);

	//Slot1
	if(rand1 == 0) {
		slot1.setText("Cherry");
	}
	else if(rand1 == 1) {
		slot1.setText("Apple");
	}
	else if(rand1 == 2) {
		slot1.setText("Grape");
	}
	//Slot2
	if(rand2 == 0) {
		slot2.setText("Cherry");
	}
	else if(rand2 == 1) {
		slot2.setText("Apple");
	}
	else if(rand2 == 2) {
		slot2.setText("Grape");
	}
	//Slot3
	if(rand3 == 0) {
		slot3.setText("Cherry");
	}
	else if(rand3 == 1) {
		slot3.setText("Apple");
	}
	else if(rand3 == 2) {
		slot3.setText("Grape");
	}
	//Comparison
	if(rand1 == rand2 && rand2 == rand3 && rand1 == rand3) {
		JOptionPane.showMessageDialog(null, "YOU WIN!");
		button.setText("Win again?");
		wins++;
		victorycounter.setText(""+ wins);
	}
	else {
	button.setText("Try again?");	
	}
	}
}

