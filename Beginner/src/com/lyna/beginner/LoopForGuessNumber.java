package com.lyna.beginner;

import javax.swing.JOptionPane;

public class LoopForGuessNumber {
	public static void main(String[] args) {
		int x = (int)(System.currentTimeMillis() % 100);
		String number = JOptionPane.showInputDialog("Input a number: ");
	    int y = Integer.parseInt(number);
	    while (y != x) {
	    	if (y > x) {
	    		JOptionPane.showMessageDialog(null, "Too high!");
	    	} else if (y < x) {
	    		JOptionPane.showMessageDialog(null, "Too low!");
	    	}
			number = JOptionPane.showInputDialog("Input a number: ");
			//For loop
		    y = Integer.parseInt(number);
	    }
	    JOptionPane.showMessageDialog(null,"Congratulations!You get the right number which is " + y);
	}
}
