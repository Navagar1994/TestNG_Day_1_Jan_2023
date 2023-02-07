package org.rerun;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class Case3 {
	
	@BeforeClass
	private void beforeClass() {
		
	}
	@BeforeMethod
	private void beforeMethod() {
		

	}
	@Test
	private void testA() {
		System.out.println("i am Test A");

	}
	@Test
	private void testB() {
		Assert.assertTrue(false);
		System.out.println("i am Test B");

	}
	@Test()
	private void testC() {
		Assert.assertEquals("century", "secondry");
		System.out.println("i am Test C");

	}
	@Test
	private void testD() {
		System.out.println("i am Test D");

	}
	@AfterMethod
	private void afterMethod() {
	
       
	}
	@AfterClass
	private void afterClass() {
		

	}


}
