package org.rerun;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class Case1 {
	
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
	@Test
	private void test2() {
		System.out.println("i am Test 2");

	}
	@Test(retryAnalyzer=WithKnownFailed.class)
	private void test3() {
		Assert.assertEquals("boundry", "accepted");
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
