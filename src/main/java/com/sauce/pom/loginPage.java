package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	private WebDriver driver;

	
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@class='submit-button btn_action']")
	private WebElement submit;
	public void sendsubmitButton()
	{
		submit.click();
	}
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
