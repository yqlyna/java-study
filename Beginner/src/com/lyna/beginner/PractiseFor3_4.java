package com.lyna.beginner;

import java.util.Scanner;

public class PractiseFor3_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number for x and y: ");
		int x = input.nextInt();
		int y = input.nextInt();
		if (x > 2) {
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			}
		} else System.out.println("x is " + x);
	}
}
