package org.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2  {
	
	@BeforeClass
	private void beforeClass() {
		
		System.out.println("Before Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test(priority=-4)
	private void test4() {
		System.out.println("Test4");
	}
	@Test(priority=3)
	private void test2() {
		System.out.println("Test2");
	}
	@Test(invocationCount=6)
	private void test3() {
		System.out.println("Test3");
	}
	@Test(enabled=false) 
	private void test1() {
		System.out.println("Test1");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");

	}

}
