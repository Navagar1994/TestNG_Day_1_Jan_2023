package org.parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alpha {

	@BeforeClass
	private void beforeClass() {
		System.out.println("i am Before class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("i am Before Method");
	}
	@Test
	private void testa1() {
		System.out.println("i am Test a1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void testa2() {
		System.out.println("i am Test a2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void testA1() {
		System.out.println("i am Test A1");
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test
	private void testA2() {
		System.out.println("i am Test A2");
		System.out.println(Thread.currentThread().getId());
	}
	@AfterMethod
	private void afterMethod() {
	}
	@AfterClass
	private void afterClass() {
		
	}
}
