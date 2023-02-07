package org.demo;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	private void test1() {
	System.out.println("Test1");
	}
	
	@Test(invocationCount=10)
	private void test2() {
		System.out.println("Test2");
	}
	@Test(enabled=false)
	private void test3() {
		System.out.println("Test3");
	}
	@Test(priority=-99)
	private void test4() {
		System.out.println("Test4");
	}
	@Test(priority=9)
	private void test5() {
		System.out.println("Test5");
	} 

}
