package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.pom.homePage;
import com.sauce.pom.loginPage;

public class TC02LogOut extends testbaseClass {
	
	@Test
	public void method()
	{
//		System.setProperty("webdriver.chrome.driver",
//		         "C:\\chrome1\\chromedriver.exe");
//
//				WebDriver driver =  new ChromeDriver();
//				System.out.println("Browser Open");
//				driver.manage().window().maximize();
//
//				driver.get("https://www.saucedemo.com/");
//				System.out.println("Url open");
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//				
//				loginPage lp=new loginPage(driver);
//				lp.sendusername();
//				Thread.sleep(1000);
//				System.out.println("use name send");
//				lp.sendpassword();
//				Thread.sleep(1000);
//				System.out.println("password send");
//				lp.sendsubmitButton();
//				Thread.sleep(1000);
//				System.out.println("login successfuly");
//				
				
				
				
				
				
				String ExpectedUrl="https://www.saucedemo.com/";
				String ActualUrl=driver.getCurrentUrl();
				if(ExpectedUrl.equals(ActualUrl))
				{
					System.out.println("test case pass");
				}
				else
				{
					System.out.println("test case failed");
				}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
