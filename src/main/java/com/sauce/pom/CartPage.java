package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	private WebDriver driver; 
	
	@FindBy(xpath="//button[@class='btn btn_secondary back btn_medium']")
	private WebElement continue1;
	
	public void continue1()
	
	{
		continue1.click();
	}
	
	@FindBy(xpath="//button[@class='btn btn_secondary btn_small cart_button']")
     private WebElement remove;
	public void remove()
	{
		remove.click();
	}
	
	
	@FindBy(xpath="//button[@class='btn btn_action btn_medium checkout_button']")
	private WebElement checkout;
	
	public void checkout()
	{
		checkout.click();
	}
	
	
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
