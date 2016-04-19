package com.pvmsys.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static String RandomString;
	public static WebDriver driver=null;


	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BasePage.driver = driver;
		System.out.println("Main Driver");
	}
	public BasePage()
     {
	
      }

	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	

	

}
