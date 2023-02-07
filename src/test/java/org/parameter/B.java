package org.parameter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {
	
	@BeforeClass
	private void beforeClass() {
		
	}
	@BeforeMethod
	private void beforeMethod() {
		

	}
	@Parameters({"username","password"})
	@Test
	private void test11(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println("i am Test 11");

	}
	@Test
	private void test12() {
		System.out.println("i am Test 12");

	}

	@Test
	private void test13() {

		System.out.println("i am Test 13");

	}

	@Test
	private void test14() {
		System.out.println("i am Test 14");

	}
	@AfterMethod
	private void afterMethod() {
	
       
	}
	@AfterClass
	private void afterClass() {
		

	}


}
