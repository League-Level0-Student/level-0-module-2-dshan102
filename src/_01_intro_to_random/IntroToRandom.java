//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int num = 0;
		
		//3   Now to make num random. 
		//3a. Create an object of the Random class, Hint: Random ran = new Random()
		Random ran = new Random();
		//3b. Next, set the value of num, using .nextInt() to get a random number from the Random object
		num = ran.nextInt(21);

		//4. Now limit the value of num to be between 0 and 100
		num = ran.nextInt(101);

		//5. Now limit the value of num to be between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		num = ran.nextInt(88- -222+1)+ -222;
		
		//6. Challenge: Limit the value of num to be between -222 and 88

		//1. Print out the value of num
		System.out.print(num);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
