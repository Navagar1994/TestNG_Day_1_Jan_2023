package org.screen;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Screenshot {
	
	@BeforeClass
	private void beforeClas() {
		System.out.println("i am Before Class");

	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("i am Before Class");

	}
	@AfterMethod
	private void afterMethod() {
	System.out.println("i am After Method");
	
	}
	@AfterClass
	private void afterClass() {
		System.out.println("i am After Class");

	}
	
	@Test 
	private void testA() {
		System.out.println("i am Test A");

	}
	@Test 
	private void testA1() {
		System.out.println("i am Test A1");

	}
	@Test 
	private void testA2() {
		System.out.println("i am Test A2");

	}
	@Test 
	private void testA3() {
		System.out.println("i am Test A3");

	}

}
