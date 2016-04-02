package com.lyna.beginner;

import javax.swing.JOptionPane;

public class ComputBMI {
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter weight in pound: ");
		double weight = Double.parseDouble(input1);
		String input2 = JOptionPane.showInputDialog("Enter height in inches: ");
		double height = Double.parseDouble(input2);
		
		final double KILOGRAM_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilograms = weight * KILOGRAM_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		JOptionPane.showMessageDialog(null, "Your BMI is " + bmi);
		if (bmi < 16) {
			JOptionPane.showMessageDialog(null, "You are seriously underweight!");
		}  else if (bmi < 18) {
			JOptionPane.showMessageDialog(null, "You are underweight");
		}  else if (bmi < 24) {
			JOptionPane.showMessageDialog(null, "You are normal weight");
		}  else if (bmi < 29) {
			JOptionPane.showMessageDialog(null, "You are overweight");
		}  else if (bmi < 35) {
			JOptionPane.showMessageDialog(null, "You are seriously overweight");
		}  else {
			JOptionPane.showMessageDialog(null, "You are gravely overweight");
		}
	}
}
