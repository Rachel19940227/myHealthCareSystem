package myHealthCareSystem;

/**
 * This class represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 * Student Name: Haoran Zu
 * Student Number: 041119896
 * Professor: Natalie Gluzman
 * Time: 2024-02-14 
 * 
 */
public class BirthDate {
	/*	Attributes			************************************/
	/** Birth day															*/
	private	final	int	day;
	/** Birth month.														*/
	private	final	int	month;
	/** Birth year.														*/
	private	final	int	year;	
	
	/*	Constructors		************************************/
	/**
	 * Create the birth date for this patient.
	 * @param year		Year of birth (4 numeric characters)
	 * @param month	Month of birth (01 thru 12) (2 digit month)
	 * @param day	Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int year, int month, int day)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	/*	Accessors			************************************/
    /**
     * Gets the day of the birth date.
     *
     * @return The day of the birth date.
     */
	public int	getDay()		{	return day;			}
	 /**
     * Gets the month of the birth date.
     *
     * @return The month of the birth date.
     */
	public int	getMonth()	{	return month;		}
	/**
     * Gets the year of the birth date.
     *
     * @return The year of the birth date.
     */
	public int	getYear()	{	return year;		}
	
	/* Modifiers			************************************/

	
	/*	Normal Behavior	************************************/
	/**
     * Formats the birth date into a string in the format yyyy/mm/dd.
     *
     * @return The formatted birth date string.
     */
	public String formattedBirthDate()	{

		    return String.format("%d/%02d/%02d", year, month, day);
	}

	/**
	 * Convert this objectd into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString()	{
		return getClass().getName() + "[year=" + year + ", month=" + month + ", day=" + day + "]"; 
	}
	
	/*	Helper Methods		************************************/

}
