package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.pom.homePage;
import com.sauce.pom.loginPage;

public class TC03SingleProductSelectFunctionality extends testbaseClass {
	@Test
	public void method() throws InterruptedException
	
	{
		
	
			
			homePage hp=new homePage(driver);
			hp.add1();
			Thread.sleep(2000);
			System.out.println("product added to cart");
			
			String ActualResult=hp.getTextFromCartButton();
			String ExpectedResult="1";
			if(ActualResult.equals(ExpectedResult))
			{
				System.out.println("teast case pass");
			}
			else
			{
				System.out.println("test case failed");
			}
			
	}
}
