package org.parallel;

import java.util.Date;

import org.data.FacebookElements;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser extends FacebookElements {
	
	// Parallel Browser access using xml file(parameter)
	
	@Parameters("browsername")
	@BeforeClass
	private void beforeClass(String bname) {
		browserLaunch(bname);
		implicitlyWait(20);
		System.out.println("i am Before Class");

	}
	
	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println("Start Time....."+new Date());  
		System.out.println("i am Before Method");
	}	
	@Test()
	private void testa() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
	//Verify url
		
		ParallelBrowser pl = new ParallelBrowser();
		
		sendKeys(pl.getTxtuser(),"navagar");
		
		sendKeys(pl.getTxtpass(),"876523");
		
		click(pl.getLoginbtn());
		Thread.sleep(5000);
		
		System.out.println("i am Test a");
	
	}
	@Test()
	private void testb() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		
		ParallelBrowser pl = new ParallelBrowser();
		
		click(pl.getCreateaccbtn());
		Thread.sleep(5000);
		
		sendKeys(pl.getFirstname(),"vijaya");
		
		sendKeys(pl.getLastname(),"ragavan");
		
		sendKeys(pl.getEmail(),"arnold@gmail.com");
		
		sendKeys(pl.getEmail1(),"arnold@gmail.com");
		
		sendKeys(pl.getPassword(),"123456");
		
		selectByValue(pl.getDate(),"1");
		
		selectByVisibleText(pl.getMonth(),"May");
		
		selectByVisibleText(pl.getYear(),"1996");
		
		click(pl.getRadiobtn());
		
		System.out.println("i am Test b");

	}
	@Test()
	private void test5() {
		System.out.println("i am Test 5");

	}
	@Test()
	private void testA() {
		System.out.println("i am Test A");

	}
	@Test()
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
		System.out.println("i am After Class");
	}

}
