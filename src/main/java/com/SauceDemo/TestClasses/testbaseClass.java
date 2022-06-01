package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sauce.pom.homePage;
import com.sauce.pom.loginPage;
import com.utility.maven.ScreenShotClass;

public class testbaseClass {
	WebDriver driver;
	Logger log;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
	System.setProperty("webdriver.chrome.driver",
	         "./driver/chromedriver.exe");

			 driver =  new ChromeDriver();
			 
			 log=Logger.getLogger("AAA");
			 PropertyConfigurator.configure("log4j.properties");
		log.info("driver open");
			driver.manage().window().maximize();

			driver.get("https://www.saucedemo.com/");
			log.info("Url open");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//Login
			loginPage lp=new loginPage(driver);
			lp.sendusername();
			//username
			log.info("user name is send");
		lp.sendpassword();
			//password
			log.info("password is send");
			//login
			lp.sendsubmitButton();
			log.info("login succesfully");
			ScreenShotClass.screenshot(driver);
			

}
	@AfterMethod()
	public void tearDown() throws InterruptedException
	{
		homePage hp=new homePage(driver);
		hp.menuButton();
		log.info("menu button clicked");
		Thread.sleep(1000);
		hp.logoutButton();
		log.info("log out");
		
		
	}
	@AfterClass()
	public void browserClose()
	{
		//logout
		driver.quit();
		log.info("browser closed");
	}
}
