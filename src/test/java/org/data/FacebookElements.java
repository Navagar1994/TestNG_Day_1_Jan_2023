package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.parameter.BaseClass;


public class FacebookElements extends BaseClass {
	
	public FacebookElements() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[contains(@class,'inputtext')])[1]")
	private WebElement txtuser;
	
	@FindBy(xpath="(//input[contains(@class,'inputtext')])[2]")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[contains(text(),'in')]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'new')]")
	private WebElement createaccbtn;
	
	@FindBy(xpath="(//input[contains(@class,'_58mg')])[1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[contains(@class,'_58mg')])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[contains(@class,'_58mg')])[3]")
	private WebElement email;
	
	@FindBy(xpath="(//input[contains(@class,'_58mg')])[4]")
	private WebElement email1;
	
	@FindBy(xpath="(//input[contains(@class,'_58mg')])[5]")
	private WebElement password;
	
	@FindBy(xpath="//label[contains(text(),'M')]")
	private WebElement radiobtn;
	
	@FindBy(xpath="//select[contains(@name,'_day')]")
	WebElement date;
	
	@FindBy(xpath="//select[contains(@name,'_month')]")
	private WebElement month;
	
	@FindBy(xpath="//select[contains(@name,'_year')]")
	private WebElement year;
	

	

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getCreateaccbtn() {
		return createaccbtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getEmail1() {
		return email1;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}
	
	

}
