package org.data;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	
	@Test
	private void test1() {
		System.out.println("Test1");
	}
	@Test(dataProvider="login")
	private void test3(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
		
	    System.out.println("Test3");

	}
	@Test
	private void test2() {
		System.out.println("test2");
	}
	@DataProvider(name="login",indices= {2,3,4},parallel=true)
	private Object[] []data() {
		Object o [][]= new Object[][] {
			{"vijay","123456"},
			{"ragavan","987654"},
			{"navagar","Vijay@123"},
			{"sankar","100670"},
			{"praba","343455"}
		};
		return o;

	}

	}
	
	
	
	

	


