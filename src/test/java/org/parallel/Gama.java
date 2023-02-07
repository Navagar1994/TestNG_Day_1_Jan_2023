package org.parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gama {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("i am Before class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("i am Before Method");
	}
	@Test
	private void testg1() {
		System.out.println("i am Test a1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void testg2() {
		System.out.println("i am Test g2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void testG1() {
		System.out.println("i am Test G1");
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test
	private void testG2() {
		System.out.println("i am Test G2");
		System.out.println(Thread.currentThread().getId());
	}
	@AfterMethod
	private void afterMethod() {
	}
	@AfterClass
	private void afterClass() {
		
	}

}
