package com.pvmsys.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	public void LoginPage()
	{
		driver.navigate().to("http://192.168.1.51:8080/onosokki/login.jsp");
		driver.manage().deleteAllCookies();
	}
	
	public void UserNameTextBox()
	{
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("fams");
		
	}
	
	public void PasswordTextBox()
	{
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("fams@123");
		
	}
	
	public void ClickLoginButton()
	{
		driver.findElement(By.xpath(".//*[@id='btn_login']")).click();
		
	}
	
	public void getCurrentURL()
	{
		
		String currentURL="http://192.168.1.51:8080/onosokki/famsoasis.jsp";
		
		if(driver.getCurrentUrl().equals(currentURL))
		{
			System.out.println("User is on HomePage");
		}
		
		else
		{
			System.out.println("User is not on HomePage");
		}
		
	}
	

}
