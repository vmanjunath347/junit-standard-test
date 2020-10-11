package com.ecomerce.app.junit_standard_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test for Basic Calculator")
class CalculatorOperationTest {

	CalculatorOperation  op ;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		// create object
		 op = new CalculatorOperation();
	}

	@AfterEach
	void tearDown() throws Exception {
		op = null;
	}

	@Test
	@DisplayName("Addition Test ")
	void testAdd() {
		int actual =  op.add(100, 100);
		int expected = 200;
//		if(actulvalue==expectedvalue) {
//			System.out.println("Test is Passed !");
//		} else {
//			System.out.println("Test is Failed !");
//		}		
		assertEquals(expected, actual);
	}
	
	@Test
	@Disabled
	@DisplayName("Substraction Test ")
	void testSub() { 		
		assertEquals(0, op.sub(100, 100));
		assertEquals(50, op.sub(100, 50));
		assertEquals(-20, op.sub(100, 120));
	}
	
	@Test
	@DisplayName("Multipliation Test ")
	void testMul() {
		assertEquals(10000, op.mul(100, 100));
		//fail("A Failing Test");
	}
	
	@Test
	@DisplayName("Divsion Test Based on TDD")
	void testDiv() {
		assertEquals(0, op.div(0, 100));
		assertEquals(0, op.div(34, 0));
		assertEquals(17, op.div(34, 2));
	}

}
