package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerInfo {
private WebDriver driver;
@FindBy(xpath="//input[@id='first-name']")
private WebElement firstName;
public void firstname()
{
	firstName.sendKeys("snehal");
}

@FindBy(xpath="//input[@id='last-name']")
private WebElement lasttName;
public void lastname()
{
	lasttName.sendKeys("patil");
}
////input[@id='postal-code']
@FindBy(xpath="//input[@id='postal-code']")
private WebElement postalCode;
public void PostalCode()
{
	postalCode.sendKeys("123456789");
}
////button[@id='cancel']
@FindBy(xpath="//button[@id='cancel']")
private WebElement cancel;
public void cancel()
{
	cancel.click();
}
//continue
@FindBy(xpath="//input[@class='submit-button btn btn_primary cart_button btn_action']")
private WebElement checkout;
public void Continuetobuy()
{
	checkout.click();
}

public customerInfo(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



}
