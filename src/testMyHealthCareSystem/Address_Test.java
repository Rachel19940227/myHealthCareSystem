package testMyHealthCareSystem;


/*		@(#)Address_Test.java	Jan. 31, 2024
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
* Test class for testing the Address class
* Uses JUnit version 5
* @author Haoran Zu
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {
	/**
	 * this is Address_Test method, this class is used to test Address clas.
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
	 * 	+Address(...)
			+formattedAddress():String
			+street():String
			+postalCode():String
			+getCity():String
			+setStreet(street:String):void
			+setNumber(number:String):void
			+setCity(city:String):void
			+setCountry(country:String):void
			+setPostalCode(postalCode:String):void
	 */
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Null arguments")
		final void testAddressWithNullArguments() {
			Address result = new Address(null, null, null, null);
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
			 Address address = new Address("123", "Main St", "City", "12345");
	         assertEquals("Address [street=123, number=Main St, city=City, country=null, postalCode=12345]", address.toString());
		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address address = new Address("123", "Main St", "City", "12345");
			assertEquals("123 Main St City Country k2c1g7", address.formattedAddress("123", "Main St", "City", "Country", "k2c1g7"));
		}
		
	}

	@Nested	@DisplayName("postalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address address = new Address("123", "Main St", "City", "12345");
            assertEquals("12345", address.getPostalCode());
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address address = new Address("123", "Main St", "City", "12345");
            assertEquals("City", address.getCity());
		}	
	}

	
	@Nested	@DisplayName("setStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address address = new Address("123", "Main St", "City", "12345");
            address.setStreet("456");
            assertEquals("456", address.getStreet());
		}
	}
	
	@Nested	@DisplayName("setNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address address = new Address("123", "Main St", "City", "12345");
            address.setNumber("789");
            assertEquals("789", address.getNumber());
		}
	}


	@Nested	@DisplayName("setCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address address = new Address("123", "Main St", "City", "12345");
            address.setCity("New City");
            assertEquals("New City", address.getCity());
		}
	}
	
	@Nested	@DisplayName("setCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address address = new Address("123", "Main St", "City", "12345");
            address.setCountry("New Country");
            assertEquals("New Country", address.getCountry());
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetPostalCode() {
			/*
			 * TODO: Add code with assertion to test
			 */
			Address address = new Address("123", "Main St", "City", "12345");
            address.setPostalCode("67890");
            assertEquals("67890", address.getPostalCode());
			
		}
	}




}
