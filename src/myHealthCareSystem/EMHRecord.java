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
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024).
 * 
 */


/**
 * this class is about detail information of EMHRecord.
 * Student Name: Haoran Zu
 * Student Number: 041119896
 * Professor: Natalie Gluzman
 * Time: 2024-02-14 
 */
public class EMHRecord {
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 * 
	 * 		Provide get and set methods for all attributes that are not accounted for as constructor parameters.
	 */
	private String reportingFacilityProvince;
	private String institutionNumber;
	private String funcitonalCentreAccount;
	private int encounterSequence;
	private String healthCareNumber;
	private String chartNumber;
	private String issuingProvince;
	private String residenceCode;
	private String gender; //String{M,F,U,O}
	private int submissionYear;
	private String adminViaAmbulance;
	private int registrationDate; //int={YYYYMMDD}
	private int registrationTime; //{HHMM}
	
	/**
     * Creates an instance of the EMHRecord class with essential information.
     *
     * @param reportingFacilityProvince The reporting facility's province.
     * @param institutionNumber         The institution number.
     * @param chartNumber               The chart number.
     * @param healthCareNumber          The health care number.
     */
	public EMHRecord(String reportingFacilityProvince,String institutionNumber,String chartNumber,String healthCareNumber){
		this.reportingFacilityProvince = reportingFacilityProvince;
		this.institutionNumber = institutionNumber;
		this.chartNumber = chartNumber;
		this.healthCareNumber = healthCareNumber;
	}

	public String getReportingFacilityProvince() {
		return reportingFacilityProvince;
	}

	public void setReportingFacilityProvince(String reportingFacilityProvince) {
		this.reportingFacilityProvince = reportingFacilityProvince;
	}

	public String getInstitutionNumber() {
		return institutionNumber;
	}

	public void setInstitutionNumber(String institutionNumber) {
		this.institutionNumber = institutionNumber;
	}

	public String getHealthCareNumber() {
		return healthCareNumber;
	}

	public void setHealthCareNumber(String healthCareNumber) {
		this.healthCareNumber = healthCareNumber;
	}

	public String getChartNumber() {
		return chartNumber;
	}

	public void setChartNumber(String chartNumber) {
		this.chartNumber = chartNumber;
	}

	public String getFuncitonalCentreAccount() {
		return funcitonalCentreAccount;
	}

	public void setFuncitonalCentreAccount(String funcitonalCentreAccount) {
		this.funcitonalCentreAccount = funcitonalCentreAccount;
	}

	public int getEncounterSequence() {
		return encounterSequence;
	}

	public void setEncounterSequence(int encounterSequence) {
		this.encounterSequence = encounterSequence;
	}

	public String getIssuingProvince() {
		return issuingProvince;
	}

	public void setIssuingProvince(String issuingProvince) {
		this.issuingProvince = issuingProvince;
	}

	public String getResidenceCode() {
		return residenceCode;
	}

	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSubmissionYear() {
		return submissionYear;
	}

	public void setSubmissionYear(int submissionYear) {
		this.submissionYear = submissionYear;
	}

	public String getAdminViaAmbulance() {
		return adminViaAmbulance;
	}

	public void setAdminViaAmbulance(String adminViaAmbulance) {
		this.adminViaAmbulance = adminViaAmbulance;
	}

	public int getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(int registrationTime) {
		this.registrationTime = registrationTime;
	}
	/**
     * Returns a string representation of the EMHRecord.
     *
     * @return A string containing detailed information about the EMHRecord.
     */
	@Override
	public String toString() {

		return "EMHRecord [reportingFacilityProvince=" + reportingFacilityProvince + ", institutionNumber="
				+ institutionNumber + ", funcitonalCentreAccount=" + funcitonalCentreAccount + ", encounterSequence="
				+ encounterSequence + ", healthCareNumber=" + healthCareNumber + ", chartNumber=" + chartNumber
				+ ", issuingProvince=" + issuingProvince + ", residenceCode=" + residenceCode + ", gender=" + gender
				+ ", submissionYear=" + submissionYear + ", adminViaAmbulance=" + adminViaAmbulance
				+ ", registrationDate=" + registrationDate + ", registrationTime=" + registrationTime + "]";
	}
	
	
	
	
	
	
	
	
}
