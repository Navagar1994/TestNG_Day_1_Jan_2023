package org.parallel;

import java.util.Date;

import org.data.FacebookElements;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parallel_Xml extends FacebookElements {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("chrome");
		implicitlyWait(20);
		System.out.println("i am Before Class");

	}
	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println("Start Time....."+new Date());  
		System.out.println("i am Before Method");
	}	
	
	@Test(dataProvider="login",groups= "reset")
	private void testa(String user,String pass) throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
	//Verify url
		
		Parallel_Xml pl = new Parallel_Xml();
		
		sendKeys(pl.getTxtuser(),user);
		
		sendKeys(pl.getTxtpass(),pass);
		
		click(pl.getLoginbtn());
		Thread.sleep(5000);
		
		System.out.println("i am Test a");
	
	}
	@Test(dataProvider="registration",groups="smoke")
	private void testb(String firstname,String lastname,String email,String email1,String pass) throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		Parallel_Xml pl = new Parallel_Xml();
		
		click(pl.getCreateaccbtn());
		Thread.sleep(5000);
		
		sendKeys(pl.getFirstname(),firstname);
		
		sendKeys(pl.getLastname(),lastname);
		
		sendKeys(pl.getEmail(),email);
		
		sendKeys(pl.getEmail1(),email1);
		
		sendKeys(pl.getPassword(),pass);
		
		selectByValue(pl.getDate(),"1");
		
		selectByVisibleText(pl.getMonth(),"May");
		
		selectByVisibleText(pl.getYear(),"1996");
		
		click(pl.getRadiobtn());
		
		System.out.println("i am Test b");

	}
	@Test(groups="sanity")
	private void test5() {
		System.out.println("i am Test 5");

	}
	@Test(groups= {"sanity","regression"})
	private void testA() {
		System.out.println("i am Test A");

	}
	@Test(groups= {"regression","sanity"})
	private void testB() {
		System.out.println("i am Test B");

	}
	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println("End Time....."+new Date());
		System.out.println("i am After Method");

	}
	@AfterClass
	private void afterClass() {
		
	}
	@DataProvider(name="login")
	private Object [][]data() {
	Object o [][]= new Object [][] {
		{"vijay","123456"},
		{"Vijayaragavan","Vijay9876"},
		{"ragavan","987651"},
		{"navagar","716141"},
		{"sankar","ss98701"}
 
	};
	return o;
	}
	@DataProvider(name="registration")
	private Object[][] data1() {
		Object o [][]= new Object[][] {
			{"vijaya","ragavan","vijay@gmail.com","vijay@gmail.com","876543"},
			{"uma","maheswari","uma@gmail.com","uma@gmail.com","u10031"},
			{"mani","maran","maran@yahoo.com","maran@yahoo.com","mara@11"},
			{"satheesh","kumar","kumar@gmail.com","kumar@gmail.com","432599"},
			{"navagar","s","navagar@gmail.com","navagar@gmail.com","100200"}
		};
		return o;
	
	}
	
}	