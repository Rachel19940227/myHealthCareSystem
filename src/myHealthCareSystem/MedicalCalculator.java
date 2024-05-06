package myHealthCareSystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class to apply calculations to specific type of EMR's and data.
 * Currerntly supports BMI (Body Mass Index) calculations.
 * Student Name: Haoran Zu
 * Student Number: 041119896
 * Professor: Natalie Gluzman
 * Time: 2024-02-14 
 */
public class MedicalCalculator {
	private MedicalCalculator()	{
	}

	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * @param weight	Weight of the patient in pounds.
	 * @param height	Height of the patient in inches.
	 * @return correctly calculated BMI.
	 */
	public static double calculateBMI(double weight, double height) {
		return (weight == 0 || height == 0)  ? 0 : round((weight * 703 / (height * height)), 1);
	}
	 
	/**
	 * 
	 * @param weight	Weight of the patient in pounds.
	 * @param height	Height of the patient in inches.
	 * @return Incorrectly calculated BMI with intentional math error.
	 * 
	 * */
	public static double incorrectBMI(double weight, double height) {
		return weight * 70 / (height * height);

	}
	
	/**
	 * Main entry point for quick and dirty test purposes.
	 * @param args Command line arguments submitted thru the VM
	 */
	public static void main(String[] args) {
		System.out.println("BMI:" + calculateBMI(0, 0));
		System.out.println("BMI:" + calculateBMI(0, 60));
		System.out.println("BMI:" + calculateBMI(120, 60));
		System.out.println("BMI:" + calculateBMI(180, 70));
		System.out.println("BMI:" + calculateBMI(100, 60));

		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}
	
	/**
	 * Round the calculated BMI to 1 decimal place
	 * @param value		BMI calculated value
	 * @param places		Number of rounding positions
	 * @return	The rounded value
	 */
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	    double roundedValue = 0;
	    if (value != 0)	{
	   	 BigDecimal bd = BigDecimal.valueOf(value);
	   	 bd = bd.setScale(places, RoundingMode.HALF_UP);
	   	 roundedValue = bd.doubleValue();
	    }

	    return roundedValue;
	}
}
