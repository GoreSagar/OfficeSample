package com.pvmsys.pageObjects;

import org.openqa.selenium.By;

import Utils.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateProjectCode extends BasePage
{
	
	public  WebDriver driverr;
	public CreateProjectCode(WebDriver driver) {
		driverr=BasePage.driver;
		// TODO Auto-generated constructor stub
	}
   	

	public void AddProjectButton()
	{
		driverr.findElement(By.id("btn_add_new_Project")).click();
	}
	
	public void EnterProjectName()
	{
		driverr.findElement(By.id("txt_test_order_project_name-inputEl")).sendKeys("PrjectName_"+ CommanHandler.getRandomString(5));
	}
	
	public void EnterProjectOverView()
	{
		driverr.findElement(By.id("txt_project_overview-inputEl")).sendKeys("PrjectOverView_Demo");
	}

	public void EnterProjectManagerName()
	{
		driverr.findElement(By.id("txt_project_project_manager_name1-inputEl")).sendKeys("ProjectManagerName_Demo");
	}
	
	
	public void EnterMakerName()
	{
		driverr.findElement(By.id("txt_maker_name-inputEl")).sendKeys("MakerName_Demo");
	}
	
	public void EnterProjectPriority()
	{
		driverr.findElement(By.id("txt_project_priority-inputEl")).sendKeys("MakerName_Demo");
	}
	
	public void EnterComment1()
	{
		driverr.findElement(By.id("txt_comment1-inputEl")).sendKeys("MakerName_Demo");
	}
	
	public void EnterComment2()
	{
		driverr.findElement(By.id("txt_comment2-inputEl")).sendKeys("MakerName_Demo");
	}
	
	public void SaveProjectCode()
	{
		driverr.findElement(By.id("id='button-1061-btnIconEl")).click();
	}
	
	public void ClickTestOrderMgtTab()
	{
		driverr.findElement(By.xpath(".//*[@id='tab-1015-btnInnerEl']")).click();
	}
	
	
}
