package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
public static void main(String[] args) {
	Random randomNumber = new Random();
	int l1 = randomNumber.nextInt(50);
	int l2 = randomNumber.nextInt(50);
	int l3 = randomNumber.nextInt(50);
	int l4 = randomNumber.nextInt(50);
	int l5 = randomNumber.nextInt(50);
	JOptionPane.showMessageDialog(null, l1+","+l2+","+l3+","+l4+","+l5);
}
}
