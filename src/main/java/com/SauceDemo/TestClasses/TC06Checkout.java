package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.pom.CartPage;
import com.sauce.pom.homePage;
import com.sauce.pom.loginPage;

public class TC06Checkout extends testbaseClass {
	@Test
	public void method() throws InterruptedException
	{
		
		
				homePage hp=new homePage(driver);
				hp.add1();
				Thread.sleep(2000);
				System.out.println("product added to cart");
				
				hp.addtocart();
				System.out.println("click on add to cart product");
				
				
				
				CartPage cp=new CartPage(driver);
				cp.checkout();
				System.out.println("cliked on checkout");
				
				
				
				String Actual=driver.getCurrentUrl();
				String expected="https://www.saucedemo.com/checkout-step-one.html";
				if(Actual.equals(expected))
				{
					System.out.println("test case pass");
					System.out.println("user can checkout");
				}
				else
				{
					System.out.println("test case fail");
				}
				
	}

}
