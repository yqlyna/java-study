package com.lyna.beginner;

import java.util.Scanner;

public class TestBoolean {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		System.out.println("Is " + number + 
        "\n\tdivisible by 2 and 3? " + 
	    (number % 2 == 0 && number % 3 == 0) +
	    "\n\tdivisible by 2 or 3? " +
	    (number % 2 == 0 || number % 3 == 0) +
	    "\n\tdivisible by 2 or 3,but not both? " +
	    (number % 2 == 0 ^ number % 3 == 0));
	}
}
