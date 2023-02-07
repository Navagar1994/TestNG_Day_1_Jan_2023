package org.parallel;

import org.parameter.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser2 extends BaseClass{
	
	@Parameters("browsername")
	@BeforeClass
	private void beforeClass(String browsername) {
		browserLaunch2(browsername);

	}
	@BeforeMethod
	private void beforeMethod() {
		
	}
	
	@Test
	private void test2() {
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
	@Test
	private void test5() {
		System.out.println("i am Test 5");

	}
	@Test
	private void test6() {
		System.out.println("i am Test 6");

	}
	@Test
	private void test7() {
		System.out.println("i am Test 7");

	}
	@AfterMethod
	private void afterMethod() {
		

	}
	@AfterClass
	private void afterClass() {
		

	}
	

}
