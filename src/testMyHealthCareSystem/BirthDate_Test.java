package testMyHealthCareSystem;


/*		@(#)BirthDate_Test.java	Jan. 31, 2024
*
*/


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.*;


/**
* Test class for testing the BirthDate class
* Uses JUnit version 5
* @author Haoran Zu
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - BirthDate")
@TestMethodOrder(OrderAnnotation.class)
public class BirthDate_Test {
	/**
	 * this is BirthDate_Test method, this class is used to test BirthDate class.
	 * @param args Command-line arguments passed to the program.
	 */
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
	}

	/*		Methods to test
	 * 
		+BirthDate(day:int, month:int, year:int)
		+toString():String
		+formattedBirthDate():String
		+getDay():int
		+getMonth():int
		+getYear():int
	 */

	
	@Nested	@DisplayName("BirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class BirthDateTest {
		@Test @Order(1) @DisplayName("BirthDate() test with Null arguments")
		final void testBirthDateWithNullArguments() {
			BirthDate result = new BirthDate(0,0,0);
			assertNotNull(result);
			assertEquals(0, result.getYear());
	        assertEquals(0, result.getMonth());
	        assertEquals(0, result.getDay());
		}
	    final void testBirthDateWithValidArguments() {
	        BirthDate result = new BirthDate(2020, 5, 15);
	        assertNotNull(result);
	        assertEquals(2020, result.getYear());
	        assertEquals(5, result.getMonth());
	        assertEquals(15, result.getDay());
	    }
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			/*
			 * TODO: Add code with assertion to test
			 */
			 BirthDate birthDate = new BirthDate(1990, 10, 25);
	         assertEquals("myHealthCareSystem.BirthDate[year=1990, month=10, day=25]", birthDate.toString());
	        
		}
	}
	
	@Nested	@DisplayName("formattedBirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedBirthDate {
		@Test @Order(1) @DisplayName("formattedBirthDate()")
		final void testFormattedBirthDate() {
			/*
			 * TODO: Add code with assertion to test
			 */
			BirthDate birthDate = new BirthDate(1985,2,8);
            assertEquals("1985/02/08", birthDate.formattedBirthDate());
		}
		
	}

	@Nested	@DisplayName("getDay() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetDayTest {
		@Test @Order(1) @DisplayName("getDay()")
		final void testGetDay() {
			/*
			 * TODO: Add code with assertion to test
			 */
			BirthDate birthDate = new BirthDate(2000, 7, 12);
            assertEquals(12, birthDate.getDay());
		}	
	}
	
	@Nested	@DisplayName("getMonth() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetMonthTest {
		@Test @Order(1) @DisplayName("getMonth()")
		final void testGetMonth() {
			/*
			 * TODO: Add code with assertion to test
			 */
			BirthDate birthDate = new BirthDate(1988, 4, 20);
            assertEquals(4, birthDate.getMonth());
		}	
	}
	
	@Nested	@DisplayName("getYear() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetYearTest {
		@Test @Order(1) @DisplayName("getYear()")
		final void testGetYear() {
			/*
			 * TODO: Add code with assertion to test
			 */
			BirthDate birthDate = new BirthDate(1975, 11, 30);
            assertEquals(1975, birthDate.getYear());
		}	
	}

}
