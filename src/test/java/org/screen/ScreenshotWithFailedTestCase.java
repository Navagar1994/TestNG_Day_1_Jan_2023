package org.screen;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.parameter.BaseClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScreenshotWithFailedTestCase extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("edge");
		implicitlyWait(20);
		System.out.println("i am Before Class");
		System.out.println(Thread.currentThread().getId());
	}
	@BeforeMethod
	private void beforeMethod( )   {
		
		System.out.println("Test Start Time...."+new Date());
		System.out.println("i am Before Method");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void testA() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
	// Verify url
		SoftAssert sf  = new SoftAssert();
		sf.assertTrue(getTitle().contains("Facebook"),"Verify url");  
		
		WebElement txtuser = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]"));
		txtuser.sendKeys("vijay");
	//Verify Username

		sf.assertEquals(getAttribute(txtuser),"jay","Verify user ");
		
		WebElement txtpass = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]"));
		txtpass.sendKeys("345678");
	// Verify Password
		sf.assertEquals(getAttribute(txtpass),"345678","Verify password");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[contains(@class,'_42ft')]"));
		loginbtn.click();
		Thread.sleep(50000);
		
		sf.assertAll();
		
		System.out.println("i am Test A");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(priority=-1)
	private void testB() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
	//Verify Url
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(getCurrentUrl().contains("facebook"),"Verify Url");
		
		WebElement createbtn = driver.findElement(By.xpath("//a[contains(@class,'_42ft')]"));
		createbtn.click();
		Thread.sleep(5000);
		WebElement fsname = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[3]"));
		fsname.sendKeys("vijaya");
	// Verify Firstname
		sf.assertEquals(getAttribute(fsname),"jaya","Verify Lastname");
		
		WebElement lsname = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[4]"));
		lsname.sendKeys("ragavan");
	//Verify Lastname
		sf.assertEquals(getAttribute(lsname),"ragavan","Verify Lastname");
		
		WebElement mobile = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[5]"));
		mobile.sendKeys("9876543210");
	//Verify Mobile Number
		sf.assertEquals(getAttribute(mobile),"9876543210","Verify mobile Number");
		
		WebElement pass= driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[7]"));
		pass.sendKeys("765432");
	//Verify Password
		sf.assertEquals(getAttribute(pass),"765432","Verify Password");
		
		sf.assertAll();
		
		System.out.println("i am Test B");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void testC() {
		System.out.println("i am Test C");
	}
	@Test(enabled=false)
	private void testD() {
		System.out.println("i am Test D");
	}
	@Test
	private void testE() {
		System.out.println("i am Test E");
	}
	@Test(invocationCount=3)
	private void testF() {
		System.out.println("i am Test F");
	}
	@Ignore
	@Test
	private void testG() {
		System.out.println("i am Test G");
		System.out.println(Thread.currentThread().getId());
	}
	@AfterMethod
	private void afterMethod(ITestResult i) throws IOException { 
		
		int status = i.getStatus();  // get Test Result >>if test pass =1
		String name = i.getName();   // get test Name >> if test faied =2
		if(status==2) {
			screenshotFailedTestCase(name);
		}
		System.out.println("Test end Time....."+new Date());
		System.out.println("i am After Method");
		System.out.println(Thread.currentThread().getId());
	}
	@AfterClass
	private void afterClass() {
		System.out.println("i am After Class");
		System.out.println(Thread.currentThread().getId());
	}
	

}
