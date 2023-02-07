package org.parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beta {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("i am Before class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("i am Before Method");
	}
	@Test
	private void testb1() {
		System.out.println("i am Test b1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void testb2() {
		System.out.println("i am Test b2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void testB1() {
		System.out.println("i am Test B1");
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test
	private void testB2() {
		System.out.println("i am Test B2");
		System.out.println(Thread.currentThread().getId());
	}
	@AfterMethod
	private void afterMethod() {
	}
	@AfterClass
	private void afterClass() {
		
	}

}
