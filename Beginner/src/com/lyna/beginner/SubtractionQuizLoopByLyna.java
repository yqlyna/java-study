package com.lyna.beginner;

import java.util.Scanner;

public class SubtractionQuizLoopByLyna {
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int count = 0;
		String output = "";
		Scanner input = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		while (count < NUMBER_OF_QUESTIONS) {
			System.out.println("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			} else System.out.println("Your answer is wrong." + 
				number1 + " - " + number2 + " should be " + (number1 - number2));
			count++;
			
			output += "\n" + number1 + " - " + number2 + "? " +
			((number1 - number2 == answer) ? " Correct" : " Wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct count is " + correctCount + 
					"\nTest time is " + testTime / 1000 + "seconds\n" + output);
	}
}
