package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sauce.pom.homePage;
import com.sauce.pom.loginPage;

public class TC04MultipleProductSelection extends testbaseClass {
@Test
public void method() throws InterruptedException
{

	
			
			homePage hp=new homePage(driver);
		
			hp.addAllProducts();
			
			Thread.sleep(2000);
			String ActualResult=hp.getTextFromCartButton();
			String ExpectedResult="6";
			if(ExpectedResult.equals(ActualResult))
			{
				System.out.println("test case pass");
			}
			else
			{
				System.out.println("test case failed");
			}
			
			
}
}
