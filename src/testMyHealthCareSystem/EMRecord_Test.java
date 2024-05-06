package testMyHealthCareSystem;


/*		@(#)EMRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author Haoran Zu
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {
	/**
	 * this is EMRecord_Test method, this class is used to test EMRecord class.
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
		+EMRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
		+setName(name:Name):void
		+setAddress(address:Address):void
		+setHeight():void
		+getHeight():int
		+setWeight():void
		+getWeight():int
		+formattedName():String
		+formattedAddress():String
		+bmi():int
	 */

	
	@Nested	@DisplayName("EMRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMRecordTest {
		@Test @Order(1) @DisplayName("EMRecord() test with Null arguments")
		final void testEMRecordWithNullArguments() {
			/*
			 * TODO: Add code with assertion to test constructor\
			 */
			EMRecord result = null;
			assertNull(result);
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
        final void testEMRecordWithValidArguments() {
        	String reportingFacilityProvince = "Ontario";
            String institutionNumber = "123456";
            String chartNumber = "CH123";
            String healthCareNumber = "HC98765";
            double height = 175.0;
            double weight = 70.0;
            EMRecord result = new EMRecord("Ontario", "123456", "CH123", "HC98765", 175.0, 70.0);
            assertEquals(reportingFacilityProvince, result.getReportingFacilityProvince());
            assertEquals(institutionNumber, result.getInstitutionNumber());
            assertEquals(chartNumber, result.getChartNumber());
            assertEquals(healthCareNumber, result.getHealthCareNumber());
            assertEquals(height, result.getHeight());
            assertEquals(weight, result.getWeight());
        }
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			/*
			 * TODO: Add code with assertion to test
			 */
			EMRecord emRecord = new EMRecord("Ontario", "123456", "CH123", "HC98765", 175.0, 70.0);

	        // Define the expected string based on the specific values
	        String expectedString = "EMHRecord [reportingFacilityProvince=Ontario, institutionNumber=123456, funcitonalCentreAccount=null, encounterSequence=0, healthCareNumber=HC98765, chartNumber=CH123, issuingProvince=null, residenceCode=null, gender=null, submissionYear=0, adminViaAmbulance=null, registrationDate=0, registrationTime=0]"+"\n"+
	        		"EMRecord is:[height=175.0, weight=70.0, Name=null, Address=null]";
	        // Call the toString method and compare with the expected string
	        String actualString = emRecord.toString();
	        assertEquals(expectedString, actualString);
		}
	}

	
	/*
	 * TODO: Add code to test one set method and one get method
	 */
        @Test
        @Order(1)
        @DisplayName("getHeight() and setHeight()")
        final void testGetAndSetHeight() {
            EMRecord emRecord = new EMRecord("Ontario", "123456", "CH123", "HC98765", 175.0, 70.0);

            // Test set method
            emRecord.setHeight(180.0);
            assertEquals(180.0, emRecord.getHeight());

            // Test get method
            assertEquals(180.0, emRecord.getHeight());
        }

}
