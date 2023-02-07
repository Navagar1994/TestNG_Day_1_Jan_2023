package org.group;

import org.testng.annotations.Test;

public class Grouping1 {
	
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
