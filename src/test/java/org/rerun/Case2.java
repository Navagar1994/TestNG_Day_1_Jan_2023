package org.rerun;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class Case2 {
	
	@BeforeClass
	private void beforeClass() {
		
	}
	@BeforeMethod
	private void beforeMethod() {
		

	}
	@Test
	private void testa() {
		System.out.println("i am Test a");

	}
	@Test
	private void testb() {
		System.out.println("i am Test b");

	}
	@Test()
	private void testc() {
		Assert.assertEquals("country", "nation");
		System.out.println("i am Test c");

	}
	@Test
	private void testd() {
		Assert.assertTrue(false);
		System.out.println("i am Test d");

	}
	@AfterMethod
	private void afterMethod() {
	
       
	}
	@AfterClass
	private void afterClass() {
		

	}


}
