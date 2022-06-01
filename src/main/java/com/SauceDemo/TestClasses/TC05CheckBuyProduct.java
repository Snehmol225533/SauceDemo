package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.pom.Billing;
import com.sauce.pom.CartPage;
import com.sauce.pom.customerInfo;
import com.sauce.pom.homePage;
import com.sauce.pom.loginPage;

public class TC05CheckBuyProduct extends testbaseClass{
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
				customerInfo ci=new customerInfo(driver);
				ci.firstname();
				System.out.println("first name entered");
				ci.lastname();
				System.out.println("last name entered");
				ci.PostalCode();
				System.out.println("postal code entered");
				ci.Continuetobuy();
				
				String actual=driver.getCurrentUrl();
				String expected="https://www.saucedemo.com/checkout-step-two.html";
				if(actual.equals(expected))
				{
					System.out.println("test case pass");
					System.out.println("user can buy product");
				}
				else
				{
					System.out.println("test case fail");
				}
				Billing bl=new Billing(driver);
				bl.Finish();
				System.out.println("finish");
				
			
				
				
	}

}
