package testMyHealthCareSystem;

/*		@(#)MedicalCalculator_Test.java	Jan. 31, 2024
*
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
* Test class for testing the MedicalCalculator class
* Uses JUnit version 5
* @author Haoran Zu
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain")
@TestMethodOrder(OrderAnnotation.class)
public class MedicalCalculator_Test {
	/**
	 * this is MedicalCalculator_Test method, this class is used to test MedicalCalculator class.
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

	
	@Nested	@DisplayName("calculateBMI() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class calculateBMITest {

		@Test @Order(1) @DisplayName("calculateBMI() test with Null arguments")
		final void testCalculateBMIWithNullArguments() {
			double result = MedicalCalculator.calculateBMI(0.0, 0.0);
			System.out.println("calculateBMI() ->BMI:" + result);
			assertEquals(result,0);
		}
		
		@Test @Order(2) @DisplayName("calculateBMI() test with height = 0")
		final void testCalculateBMIWithHeightZero() {
			double result = MedicalCalculator.calculateBMI(165, 0);
			System.out.println("calculateBMI(165,0) ->BMI:" + result);
			assertEquals(result,0);
		}

		@Test @Order(2) @DisplayName("calculateBMI() test with weight = 0")
		final void testCalculateBMIWithWeightZero() {
			double result = MedicalCalculator.calculateBMI(0, 69);
			System.out.println("calculateBMI(0,69) ->BMI:" + result);
			assertEquals(result,0);
		}

		@Test @Order(2) @DisplayName("calculateBMI() test with valid arguments")
		final void testCalculateBMIWithValidArguments() {
			double result = MedicalCalculator.calculateBMI(165, 69);
			System.out.println("calculateBMI(165,69) ->BMI:" + result);
			assertEquals(result,24.4);
		}
		@Test @Order(2) @DisplayName("IncorrectBMI() test with valid arguments")
		final void testIncorrectBMIWithValidArguments() {
	        // Weight and height values for testing
	        double weight = 150;  // Example weight in pounds
	        double height = 68;   // Example height in inches

	        // Call the incorrectBMI method
	        double result = MedicalCalculator.incorrectBMI(weight, height);

	        // Assert that the result is not equal to the correct BMI calculation
	        assertEquals(MedicalCalculator.calculateBMI(weight, height), result,
	                "The incorrectBMI method should be an error in the math.");
	    }

	}

	
	
}	/*	End of test classes					*/
