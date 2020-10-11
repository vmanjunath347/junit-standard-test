package com.ecomerce.app.junit_standard_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Junit 5 Standard Test with Annotation .")
public class StandardTestClass {
	
	@BeforeAll
	static void setUpAll() {
		System.out.println("--- Before All ! ---");
	}
	
	@BeforeEach
	void setUpForEachTest() {
		System.out.println("--- Before Each Test ! ---");
	}
	
	@AfterEach
	void tearDownFoEachTest() {
		System.out.println("--- After Each Test ! ---");
	}
	
	@AfterAll
	static void tearAll() {
		System.out.println("--- After All ! ---");
	}
	
	@Test
	@DisplayName("First Sample Test")
	public void testCall1() {
		System.out.println("--- This is main test call 1 ! ---");
	}
	
	@Test
	@DisplayName("Second Sample Test")
	void testCall2() {
		System.out.println("--- This is main test call 2 ! ---");
	}
	
	
}
