package org.parameter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	
	@BeforeClass
	private void beforeClass() {
		
	}
	@BeforeMethod
	private void beforeMethod() {
		

	}
	@Test
	private void test1() {
		System.out.println("i am Test 1");

	} 
	@Parameters({"username","password"})
	@Test
	private void test2(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println("i am Test 2");

	}
	@Test
	private void test3() {
		System.out.println("i am Test 3");

	}
	@Test
	private void test4() {
		System.out.println("i am Test 4");

	}
	@AfterMethod
	private void afterMethod() {
	
       
	}
	@AfterClass
	private void afterClass() {
		

	}


}
