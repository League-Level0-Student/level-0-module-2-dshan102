package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Roller_Coaster {
public static void main(String[] args) {
	String height1 = JOptionPane.showInputDialog("How tall are you? (in inches)");
	Integer.parseInt(height1);
	int height = Integer.parseInt(height1);
	if(height>=48) {
		JOptionPane.showMessageDialog(null, "You can go on the roller coaster.");
	}
	else {
		JOptionPane.showMessageDialog(null, "You need to grow more before you can ride the roller coaster.");
	}

}
}
