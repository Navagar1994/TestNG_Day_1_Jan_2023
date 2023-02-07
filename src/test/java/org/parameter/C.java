package org.parameter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C {
	
	@BeforeClass
	private void beforeClass() {
		
	}
	@BeforeMethod
	private void beforeMethod() {
		

	}
	@Parameters({"username","password"})
	@Test
	private void test21(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println("i am Test 21");

	}
	@Test
	private void test22() {
		System.out.println("i am Test 22");

	}

	@Test
	private void test23()  {
		System.out.println("i am Tet 23");

	}
	@Test
	private void test24() {
		System.out.println("i am Test 24");

	}
	@AfterMethod
	private void afterMethod() {
	
       
	}
	@AfterClass
	private void afterClass() {
		

	}

}
