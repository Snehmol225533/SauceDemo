package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing {
	private WebDriver driver;
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancel;
	public void cancel()
	{
		cancel.click();
	}
	////button[@id='finish']
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement finish;
	public void Finish()
	{
		finish.click();
	}
////button[@id='back-to-products']
	
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement BackPage;
	public void backpage()
	{
		BackPage.click();
	}
	
	
	public Billing(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
