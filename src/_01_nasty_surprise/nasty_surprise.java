package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nasty_surprise implements ActionListener  {
	
static JFrame frame = new JFrame();
static JButton button = new JButton();
static JButton button2 = new JButton();
static JPanel panel = new JPanel();

public static void main(String[] args) {

nasty_surprise trickortreat = new nasty_surprise();	
trickortreat.makebuttons();
}
public void makebuttons() {
frame.setVisible(true);
panel.add(button);
panel.add(button2);
button.setText("Trick");
button.addActionListener(this);
button2.addActionListener(this);
button2.setText("Treat");
frame.add(panel);
frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	if (arg0.getSource().equals(button)) {
		showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/commons/6/66/An_up-close_picture_of_a_curious_male_domestic_shorthair_tabby_cat.jpg");
	}
	else {
		showPictureFromTheInternet("https://live.staticflickr.com/5120/5824578555_d239d42195_b.jpg");
	}
	
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}

//