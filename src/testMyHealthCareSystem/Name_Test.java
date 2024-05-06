package testMyHealthCareSystem;


/*		@(#)Name_Test.java	Jan. 31, 2024
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
* Test class for testing the Name class
* Uses JUnit version 5
* @author Haoran Zu
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Name")
@TestMethodOrder(OrderAnnotation.class)
public class Name_Test {
	/**
	 * this is Name_Test method, this class is used to test Name class.
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
			+Name(...)
			+toString():String
			+formattedName():String
			+setFirst(first:String):void
			+setLast(last:String):void
			+setMiddle(middle:String):void
			+setSaluation(salutation:String):void
			+first():String
			+last():String
	 */
	
	@Nested	@DisplayName("Name() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class NameTest {
		@Test @Order(1) @DisplayName("Name() test with Null arguments")
		final void testNameWithNullArguments() {
			Name result = new Name();
			assertNotNull(result);
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
			Name name = new Name("John Watson");
            assertEquals("Name [first=John, last=Watson, middle=null]", name.toString());
		}
	}
	
	@Nested	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedName {
		@Test @Order(1) @DisplayName("formattedName()")
		final void testFormattedName() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name name = new Name();
            String[] result = name.formattedName("John Watson");
            assertArrayEquals(new String[] { "John", "Watson" }, result);
		}
		
	}

	@Nested	@DisplayName("setFirst() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetFirstTest {
		@Test @Order(1) @DisplayName("setFirst()")
		final void testSetFirst() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name name = new Name();
            name.setFirst("John");
            assertEquals("John", name.getFirst());
		}	
	}
	
	@Nested	@DisplayName("setLast() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetLastTest {
		@Test @Order(1) @DisplayName("setLast()")
		final void testSetLast() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name name = new Name();
            name.setLast("Doe");
            assertEquals("Doe", name.getLast());
		}	
	}

	@Nested	@DisplayName("setMiddle() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetMiddleTest {
		@Test @Order(1) @DisplayName("setMiddle()")
		final void testMiddle() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name name = new Name();
            name.setMiddle("Middle");
            assertEquals("Middle", name.getMiddle());
		}	
	}

	
	@Nested	@DisplayName("setSalutation() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetSalutationTest {
		@Test @Order(1) @DisplayName("setSalutation()")
		final void testSetSalutation() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name name = new Name();
            name.setSalutation("Mr.");
            assertEquals("Mr.", name.getSalutation());
		}
	}
	
	@Nested	@DisplayName("first() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FirstTest {
		@Test @Order(1) @DisplayName("first()")
		final void testFirst() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name name = new Name("John", "Watson");
            assertEquals("John", name.getFirst());
		}
	}


	@Nested	@DisplayName("last() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class LastTest {
		@Test @Order(1) @DisplayName("last()")
		final void testlast() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Name name = new Name("John", "Watson");
            assertEquals("Watson", name.getLast());
		}
	}
	

}
