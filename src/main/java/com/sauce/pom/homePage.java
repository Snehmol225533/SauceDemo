package com.sauce.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homePage {
	private WebDriver driver;
	private Select s;

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement add1;
	public void add1()
	{
		add1.click();
	}
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement add2;
	public void add2()
	{
		add2.click();
	
	}
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement add3;
	public void add3()
	{
		add3.click();
	}
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement add4;
	public void add4()
	{
		add4.click();
	}
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement add5;
	public void  add5()
	{
	add5.click();	
	}
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement add6;
	public void add6()
	{
		add6.click();
		
	}

	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menu;
	
	public void menuButton()
	{
		menu.click();
	}
     
	  
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement about;
	
	public void aboutUs()
	{
		about.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
	public void logoutButton()
	{
		logout.click();
	}
	
	@FindBy(xpath="//a[@id='reset_sidebar_link']")
	private WebElement reset;
	public void resetapp()
	{
		reset.click();
	}
//@FindBy(xpath="//select[@class='product_sort_container']")
//private WebElement dropdown;
//public void dropdown()
//{
	
			
//}
@FindBy(xpath="//select[@class='product_sort_container']")
private WebElement dropdown1;
public String dropdown1()
{
	dropdown1.click();
	s=new Select(dropdown1);
			s.deselectByVisibleText("Price (high to low)");;
	String s=dropdown1.getText();
	return s;
}




@FindBy(xpath="//button[text()='Add to cart']")
 private List<WebElement> allproducts;
public void addAllProducts()
{
	for(WebElement WebElement: allproducts)
	{
		allproducts.get(0).click();
	}
}

@FindBy(xpath="//a[@class='shopping_cart_link']")
private WebElement addToCartButton;
public String getTextFromCartButton()
{
	String TotlProducts=addToCartButton.getText();
			return TotlProducts;
}
@FindBy(xpath="//a[@class='shopping_cart_link']")
private WebElement addToCartButton1;
public void addtocart()
{
	addToCartButton1.click();
}

public homePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



}

