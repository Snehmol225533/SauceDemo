package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pom.loginPage;

public class TC01LoginFunctionality extends testbaseClass {
@Test
	public void method()
	{
	
		
				
				String ExpectedTitle="Swag Labs";
				String ActualTitle=driver.getTitle();
				
				
				if(ExpectedTitle.equals(ActualTitle))
				{
					System.out.println("Test Case Pass");
			}
			else
				{
					System.out.println("test case failed");
			}
			
				
	}

}
