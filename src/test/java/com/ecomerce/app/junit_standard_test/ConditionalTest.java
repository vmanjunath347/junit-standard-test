package com.ecomerce.app.junit_standard_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test Run On Windows")
	@EnabledOnOs({OS.WINDOWS})
	void runOnWindows() {
		System.out.println("This Run only in Windows");
		assertTrue(true);
	}
	
	
	@Test
	@DisplayName("Test Run On Linux")
	@EnabledOnOs({OS.LINUX})
	void runOnLinux() {
		System.out.println("This Run only in Linux");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run On JR.8")
	@EnabledOnJre({JRE.JAVA_8})
	void runOnJRE8() {
		System.out.println("This Run only in Java 8");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run On JR.11")
	@EnabledOnJre({JRE.JAVA_11})
	void runOnJRE11() {
		System.out.println("This Run only in Java 11");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test OnSome random Condition")
	@DisabledIf("Math.random() < 0.31415")
	void someRandomTest() {
		System.out.println("This may or not execute");
		assertTrue(true);
	}

}
