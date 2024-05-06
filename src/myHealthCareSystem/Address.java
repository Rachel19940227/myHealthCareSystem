package myHealthCareSystem;

/**
 * this class is about get and set address.
 * Student Name: Haoran Zu
 * Student Number: 041119896
 * Professor: Natalie Gluzman
 * Time: 2024-02-14 
 */
public class Address {
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */

	
	/*	Attributes			************************************/
	private String street;
	private String number;
	private String city;
	private String country;
	private String postalCode;
	
	
	/*	Constructors		************************************/
    /**
     * Constructs an Address object with the specified street, number, city, and postal code.
     *
     * @param street     The street name.
     * @param number     The street number.
     * @param city       The city name.
     * @param postalCode The postal code.
     */
	public Address(String street,String number,String city,String postalCode) {
		this.street = street;
		this.number = number;
		this.city = city;
		this.postalCode = postalCode;
	}
	
	/*	Accessors			************************************/
    /**
     * Gets the city name.
     *
     * @return The city name.
     */
	public String getCity() {
		return city;
	}
    /**
     * Gets the street name.
     *
     * @return The street name.
     */
	public String getStreet() {
		return street;
	}
	/**
     * Gets the street number.
     *
     * @return The street number.
     */
	public String getNumber() {
		return number;
	}
	/**
     * Gets the country name.
     *
     * @return The country name.
     */
	public String getCountry() {
		return country;
	}
	/**
     * Gets the postal code.
     *
     * @return The postal code.
     */
	public String getPostalCode() {
		return postalCode;
	}

	/* Modifiers			************************************/
	/**
     * Sets the street name.
     *
     * @param street The new street name.
     */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
     * Sets the street number.
     *
     * @param number The new street number.
     */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
     * Sets the city name.
     *
     * @param city The new city name.
     */
	public void setCity(String city) {
		this.city = city;
	}
	/**
     * Sets the postal code.
     *
     * @param postalCode	The new postal code.
     */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
     * Sets the country name.
     *
     * @param country The new country name.
     */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	/*	Normal Behavior	************************************/
	/**
     * Formats the address details into a single string.
     *
     * @param number     The street number.
     * @param street     The street name.
     * @param city       The city name.
     * @param country    The country name.
     * @param postalcode 	The postal code.
     * @return The formatted address string.
     */
	public String formattedAddress(String number, String street, String city, String country, String postalcode) {
	    return number + " " + street + " " + city + " " + country + " " + postalcode;
	}
	
	
	
	/*	Helper Methods		************************************/
	/**
     * Returns a string representation of the Address object.
     *
     * @return A string representation of the Address object.
     */
	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", city=" + city + ", country=" + country
				+ ", postalCode=" + postalCode + "]";
	}	


}
