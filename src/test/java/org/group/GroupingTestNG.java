package org.group;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingTestNG {
	
	@BeforeClass
	private void before() {
		System.out.println("i am Before Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("i am Before Methhod");	
	}
	@Test(groups= {"smoke","sanity"})
	private void test1() {
		System.out.println("i am Test 1");
	}
	@Test(groups= {"regression","reset"})
	private void test2() {
		System.out.println("i am Test 2");
	}
	@Test(groups= {"sanity","reset"})
	private void test3() {
		System.out.println("i am Test 3");
	}
	@Test(groups= {"reset","smoke"})
	private void test4() {
		System.out.println("i am Test 4");
	}
	@Test(groups= {"regression","smoke"})
	private void test5() {
		System.out.println("i am Test 5");
	}
	@Test(groups= {"sanity","regression"})
	private void test6() {
		System.out.println("i am Test 6");
	}
	@Test(groups= {"smoke","sanity"})
	private void test7() {
		System.out.println("i am Test 7");
	}
	@Test(groups= {"sanity","regression"})
	private void test8() {
		System.out.println("i am Test 8");
	}
	@Test(groups= {"regression","sanity"})
	private void test9() {
		System.out.println("i am Test 9");
	}
	@Test(groups= {"smoke","sanity"})
	private void test10() {
		System.out.println("i am Test 10");
	}
	@Test(groups= {"retest","sanity"})
	private void test11() {
		System.out.println("i am Test 11");
	}
}
