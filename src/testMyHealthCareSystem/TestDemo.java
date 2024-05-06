package testMyHealthCareSystem;

import myHealthCareSystem.*;

/**
 * This is a simple test demo class for the health care system.
 * @author  Haoran Zu
 * @version 1.0
 * @since   2024-01-29 
 * Student Name: Haoran Zu
 * Student Number: 041119896
 * Professor: Natalie Gluzman
 * Time: 2024-02-14 
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args Command-line arguments passed to the program.
	 */
	public static void main(String[] args) {

		/*
		 * TODO: You must use the System.out.printf, formatted prints to show all health
		 * data as found in the EMRecord class (includes the parent class EMHRecord). Do not miss any item (includes any
		 * attributes which are complex objects, name, address etc.
		 *
		 *		Use the following standards guide to discover what field entries might look like for demo purposes.
		 *
		 * 	Field values and constraints can be found in the Standards guide
		 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428
		 *
		 */

//			sample test of BirthDate class
			BirthDate bd = new BirthDate(1970,12,01);
			System.out.printf("BirtDate is:" + bd);
			System.out.println();
			
//			patient's address
			Address address = new Address("westbury RD","2375","Ottawa","k2c1g7");
			System.out.printf("Address is:" + address);
			System.out.println();
			
//			patient's name
			Name name = new Name("David Smith");
			System.out.printf("Name is:" + name);
			System.out.println();


		/*	TODO: Calculate the BMI for your patient record here.
		 * 		use the static method in the MedicalCalculator class along with instance variables from the
		 * 		EMHRecord class.
		 */
			
//			patient's EMRecord			
			EMRecord Record = new EMRecord("Ontario","011","1101","0010",60,120);
			Record.setAddress(address);
			Record.setName(name);
//			patient's EMHRecord
			Record.setFuncitonalCentreAccount("ACC001100");
			Record.setEncounterSequence(1100);
			Record.setIssuingProvince("Ontario");
			Record.setResidenceCode("12345");
			Record.setGender("Female");
			Record.setSubmissionYear(2023);
			Record.setAdminViaAmbulance("None");
			Record.setRegistrationDate(20230101);
			Record.setRegistrationTime(1800);
			
			System.out.printf("Record is：" + Record);
			System.out.println();
//			patient's BMI		
			System.out.println("My patient record BMI is:" + MedicalCalculator.calculateBMI(Record.getWeight(), Record.getHeight()));
			
		/*	You do not need to modify this piece of code, it is fine as it is.			*/
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}

}
