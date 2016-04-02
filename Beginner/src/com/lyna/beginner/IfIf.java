package com.lyna.beginner;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfIf {
	public static void main(String[] args) {
		String result = JOptionPane.showInputDialog("Enter a score: ");
		int score = Integer.parseInt(result);//change string type to number
		if (score >= 90) {
			JOptionPane.showMessageDialog(null,"A");
		} else if (score >= 80) {
			JOptionPane.showMessageDialog(null,"B");
		} else if (score >= 70) {
			JOptionPane.showMessageDialog(null,"C");
		} else if (score >= 60) {
			JOptionPane.showMessageDialog(null,"D");
		} else {
			JOptionPane.showMessageDialog(null,"F");
		}
	}
}
