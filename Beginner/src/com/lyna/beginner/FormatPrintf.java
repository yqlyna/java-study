package com.lyna.beginner;

public class FormatPrintf {
	public static void main(String[] args) {
		int a = 5;
		double b = 6.78;
		//%d=integer,%5d=****a,%05d=0000a, %f=float,%10.2f=*******b
		System.out.printf("A is %05d and B is %10.2f", a , b);
	}
}
