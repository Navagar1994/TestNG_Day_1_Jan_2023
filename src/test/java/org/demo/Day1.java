package org.demo;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day1 {
		 
	
		@BeforeClass
		private void beforeclass() {
			System.out.println("Before Class");
		}
		@BeforeMethod
		private void beforeMethod() {
			System.out.println("Before Method");
		}
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
		@AfterMethod
		private void afterMethod() {
			System.out.println("After Method");
		}
		@AfterClass
		private void afterClass() {
			System.out.println("After Class");
		}
		
		}
		
		
		
