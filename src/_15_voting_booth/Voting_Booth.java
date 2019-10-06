package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	String age1 = JOptionPane.showInputDialog("How old are you (in years)?");
	Integer.parseInt(age1);
	int age = Integer.parseInt(age1);
	if (age>=18) {
		JOptionPane.showMessageDialog(null, "Who should the next president be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "No one cares what you think.");
	}
}
}
