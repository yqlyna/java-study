package com.lyna.beginner;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number as radius: ");
		double radius = input.nextDouble();
		double PI = 3.1415926;
		if (radius >= 0) {
			double area = (int)(radius * radius * PI * 100) / 100.0;
			System.out.println("The area for the circle of radius " + radius + " is " + area);
		}
		else {
			System.out.println("Negitive input");
		}
	}
}

