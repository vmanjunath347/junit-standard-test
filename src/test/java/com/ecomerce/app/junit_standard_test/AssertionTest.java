package com.ecomerce.app.junit_standard_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Junit 5 Assertions examples")
class AssertionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Assertions examples")
	void testForAsserts() {
		
		String str = null;
		String str1 = "Some Value";
		
		String[] arr1 = {"A","B"};
		String[] arr2 = {"A","B"};
		
		boolean resTrue = 40 > 30;
		boolean resFalse = 40 < 30;
		
		assertTrue(resTrue);
		assertFalse(resFalse);
		
		assertNull(str);
		assertNotNull(str1);
		
		assertEquals(100, 100);
		assertEquals(100.33, 100.33);
		assertEquals(true, true);
		assertArrayEquals(arr1, arr2);
		
		assertThrows(RuntimeException.class, ()->{
			throw new RuntimeException();
		});
		
		
		
	}

}
