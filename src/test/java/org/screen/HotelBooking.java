  
package org.screen;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class HotelBooking extends AdactinElement {
	
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
 
		implicitlyWait(10);

		System.out.println("Before Class");

	}

	@BeforeMethod
	public void beforeMethod() {
		Date d = new Date();
		System.out.println("Test Start Time......"+d);
		System.out.println("Before Method");

	}
	@Test
	public void xTest() throws InterruptedException  {
		
		urlLaunch("https://adactinhotelapp.com/");
		
		HotelBooking hb = new HotelBooking();
		
		selectByValue(hb.getLocation(),"Brisbane");
	// Verify Hotel Location
		
		selectByValue(hb.getHotel(),"Hotel Sunshine");
	//Verify Hotel

		
		selectByVisibleText(hb.getRoomtype(),"Super Deluxe");
	// Verify Room Type

		

		selectByValue(hb.getRoomcount(),"2");
	//Verify Room Type

		
		clear(hb.getCheckin());
		
		sendKeys(hb.getCheckin(),"11/01/2023");
	// Verify Checkin Date

		
		clear(hb.getCheckout());
		
		sendKeys(hb.getCheckout(),"18/01/2023");
	//Verify Checkout Date

	
		selectByValue(hb.getAdultcount(),"2");
	//Verify Adult Count

	
		selectByIndex(hb.getChildcount(),0);
	// Verify Child Count

	   
		click(hb.getSearchbtn());
		Thread.sleep(5000);
		
		System.out.println("Test x");
	}
	
	@Test
	public void vTest() throws InterruptedException {
		
		urlLaunch("https://adactinhotelapp.com/");
		
	// verify url by using Assert methods

		
		HotelBooking hbo = new HotelBooking();
		
		sendKeys(hbo.getTxtuser(),"12345sam");
		
	// Verify Username

		
		sendKeys(hbo.getTxtpass(),"sankar12345");
		
	// Verify Password

		
		click(hbo.getLoginbtn());
		Thread.sleep(5000);
		 System .out.println("vTest");

	}
	@Test
	public void  testz() throws InterruptedException {
		
		urlLaunch("https://adactinhotelapp.com/");
		
		HotelBooking hbd = new HotelBooking();
		
		click(hbd.getRadiobutton());
	//Verify Radio button

//		
//		click(hbd.getContinuebtn());
//		Thread.sleep(5000);
		
		sendKeys(hbd.getFirstname(),"vijaya");
	//Verify Firstname

		
		
		sendKeys(hbd.getLastname(),"ragavan");
	//Verify lastname

		
		sendKeys(hbd.getAddress(),"No.22,Peterburg street,Birsbane,Australia");
		

		
		sendKeys(hbd.getCcdno(),"9876543210123456");
	//Verify card number

		
		selectByValue(hbd.getCardtype(),"MAST");
	//Verify card

		
		selectByValue(hbd.getExmonth(),"12");
	//verify expairy month

		
		selectByVisibleText(hbd.getExyear(),"2022");
	// Verify Expairy Year

		
		sendKeys(hbd.getCvvnum(),"933");
	//Verify Cvv Number

		
		
		click(hbd.getBookbtn());
		Thread.sleep(5000);
		
		System.out.println("Test z");

	}
	@AfterMethod
	public void after() {
		System.out.println("Test End Time......"+new Date());
		System.out.println("After Method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	

}
