package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.pom.homePage;
import com.sauce.pom.loginPage;

public class TC07Filter extends testbaseClass{
	@Test
	public void method()
	{
				
				homePage hp=new homePage(driver);
				hp.dropdown1();
			String Actual=hp.dropdown1();
			System.out.println(Actual);
		
			String Expected="Price (low to high)";
			if(Actual.equals(Expected))
			{
				System.out.println("test  case pass");
			}
			else
			{
				System.out.println("test case fail");
			}
				System.out.println("filter applied");
	}

}
