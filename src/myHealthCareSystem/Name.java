package myHealthCareSystem;

import java.lang.reflect.Array;

/**
 * This class is about some constructor of Name.
 * Student Name: Haoran Zu
 * Student Number: 041119896
 * Professor: Natalie Gluzman
 * Time: 2024-02-14 
 */
public class Name {
	/*	TODO:	Implement this class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */
	
	
	/*	Attributes			************************************/
	private String Name;
	private String first;
	private String last;
	private String middle;
	private String salutation;
	
	
	/*	Constructors		************************************/
	/**
     * Constructs a default Name object.
     */
	public Name() {
        // Default constructor
    }
	/**
     * Constructs a Name object from a full name string.
     *
     * @param Name The full name string.
     */
	public Name(String Name) {
		String[] arr = formattedName(Name);
		this.first = arr[0];
        this.last = arr[1];
	}
	/**
     * Constructs a Name object with first and last names.
     *
     * @param first The first name.
     * @param last  The last name.
     */
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	/**
     * Constructs a Name object with first, last, and middle names.
     *
     * @param first  The first name.
     * @param last   The last name.
     * @param middle The middle name.
     */
	public Name(String first, String last, String middle) {
		this.first = first;
		this.last = last;
		this.middle = middle;
		
	}
	
	
	
	/*	Accessors			************************************/
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getMiddle() {
        return middle;
    }

    public String getSalutation() {
        return salutation;
    }
	
	
	
	/* Modifiers			************************************/
    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

	
	
	
	/*	Normal Behavior	************************************/
	
    /**
     * Formats a full name string into an array of first and last names.
     *
     * @param Name The full name string.
     * @return An array containing the first and last names.
     */
    public String[] formattedName(String Name) {
		if(Name.contains(" ")) {
			return Name.split("\\s");
		}else {
			return swapName(Name);
		}

	}
    /**
     * Swaps the order of names in a comma-separated string.
     *
     * @param Name The comma-separated name string.
     * @return An array containing the swapped first and last names.
     */
	public String[] swapName(String Name) {
		String[] arr = Name.split(",");
		String temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		return arr;
		
	}
	
	
	
	/*	Helper Methods		************************************/
	@Override
	/**
     * Returns a string representation of the Name object.
     *
     * @return A string containing the first, last, and middle names.
     */
	public String toString() {
		return "Name [first=" + first + ", last=" + last + ", middle=" + middle + "]";
	}
	


}
