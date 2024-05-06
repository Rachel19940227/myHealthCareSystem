package testMyHealthCareSystem;


/*		@(#)EMHRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMHRecord class
* Uses JUnit version 5
* @author Haoran Zu
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {
	/**
	 * this is EMHRecord_Test method, this class is used to test EMHRecord class.
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
		+EMHRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
	 */

	
	@Nested	@DisplayName("EMHRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMHRecordTest {
		@Test @Order(1) @DisplayName("EMHRecord() test with Null arguments")
		final void testEMHRecordWithNullArguments() {
			/*
			 * TODO: Add code with assertion to test constructor\
			 */
			EMHRecord result = null;
			assertNull(result);
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		final void testEMHRecordWithValidArguments() {
            EMHRecord result = new EMHRecord("ON", "123456", "CH12345", "HC67890");
            assertNotNull(result);
            assertEquals("ON", result.getReportingFacilityProvince());
            assertEquals("123456", result.getInstitutionNumber());
            assertEquals("CH12345", result.getChartNumber());
            assertEquals("HC67890", result.getHealthCareNumber());
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
			EMHRecord emhRecord = new EMHRecord("Ontario", "123456", "CH123", "HC98765");
            String expected = "EMHRecord [reportingFacilityProvince=Ontario, institutionNumber=123456, funcitonalCentreAccount=null, "
                    + "encounterSequence=0, healthCareNumber=HC98765, chartNumber=CH123, issuingProvince=null, residenceCode=null, gender=null, "
                    + "submissionYear=0, adminViaAmbulance=null, registrationDate=0, registrationTime=0]";
            assertEquals(expected, emhRecord.toString());
		}
	}
	/*
	 * TODO: Add code to test one set method and one get method
	 */
    @Test
    @Order(1)
    @DisplayName("setReportingFacilityProvince() and getReportingFacilityProvince()")
    final void testGetAndSetReportingFacilityProvince() {
        EMHRecord emhRecord = new EMHRecord("Ontario", "123456", "CH123", "HC98765");

        // Test set method
        emhRecord.setReportingFacilityProvince("Quebec");
        assertEquals("Quebec", emhRecord.getReportingFacilityProvince());

        // Test get method
        assertEquals("Quebec", emhRecord.getReportingFacilityProvince());

        // Additional checks or assertions can be added as needed
    }

}
