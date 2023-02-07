package org.parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Sample {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
	private void test3() {
		System.out.println("Test3");
	}
	@Parameters({"Username","Password"})
	@Test
	private void test1(@Optional("vijaya")String user, @Optional("345676")String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println("Test1");
	}
	@Test
	private void test2() {
		System.out.println("test3");
	}

}
