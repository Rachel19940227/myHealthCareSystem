package myHealthCareSystem;

/*
 * 	W24	CST8284
 * 	Assignment 1: My Health System
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.
 *		REVIEW THIS FILE, ASSIGNMENT INSTRUCTIONS, UML Class Diagram CAREFULLY BEFORE YOU START CODING!
 *
 * 	Remove unneeded comments/code when you are done. (Clean code is better code).
 * 
 * 	Field values and constraints can be found in the Standards guide
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024)
 * 
 */

/**
 * this class is about detail information of EMRecord.
 * Student Name: Haoran Zu
 * Student Number: 041119896
 * Professor: Natalie Gluzman
 * Time: 2024-02-14 
 */
public class EMRecord extends EMHRecord		{
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */

	
	/*	Attributes			************************************/
	private double height;
	private double weight;
	private Name name;
	private Address address;
	
	
	/*	Constructors		************************************/
	/**
     * Constructs an instance of the EMRecord class with essential information.
     *
     * @param reportingFacilityProvince The reporting facility's province.
     * @param institutionNumber         The institution number.
     * @param chartNumber               The chart number.
     * @param healthCareNumber          The health care number.
     * @param height                    The height of the patient.
     * @param weight                    The weight of the patient.
     */
	public EMRecord(String reportingFacilityProvince,String institutionNumber,String chartNumber,String healthCareNumber, double height, double weight) {
		super(reportingFacilityProvince,institutionNumber,chartNumber,healthCareNumber);
		this.height = height;
		this.weight = weight;
	}
	
	
	/*	Accessors			************************************/
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}

	
	
	/* Modifiers			************************************/
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
     * Sets the name of the patient.
     *
     * @param name The name of the patient.
     */
	public void setName(Name name) {
		this.name = name;
	}
	/**
     * Sets the address of the patient.
     *
     * @param address The address of the patient.
     */
	public void setAddress(Address address) {
		this.address = address;
	}

	
	/*	Normal Behavior	************************************/

	/**
     * Calculates and returns the Body Mass Index (BMI) of the patient based on height and weight.
     *
     * @return The calculated BMI as an integer.
     */


	public int bmi() {
		return (int) MedicalCalculator.calculateBMI(height, weight);
		
	}



	
	/**
     * Returns a string representation of the EMRecord.
     *
     * @return A string containing detailed information about the EMRecord.
     */
	@Override
	public String toString() {
		
		return super.toString()+ "\n" + "EMRecord is:[height=" + height + ", weight=" + weight + ", Name=" + name
				+ ", Address=" + address + "]";
	}

	
	
	
	/*	Helper Methods		************************************/
	

    
}
