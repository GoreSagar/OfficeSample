package com.pvmsys.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pvmsys.pageObjects.CreateProjectCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateProjectCodeSteps {
	WebDriver d1=new FirefoxDriver();
	CreateProjectCode project= new CreateProjectCode(d1 );
	

	@Given("^User selects Test Order Management Tab$")
	public void user_selects_Test_Order_Management_Tab() throws Throwable {
		
		project.ClickTestOrderMgtTab();
	 
	}

	@Given("^User clicks on Add Project Button$")
	public void user_clicks_on_Add_Project_Button() throws Throwable {
		
		project.AddProjectButton();
	   
	}

	@Given("^User enters all required Information$")
	public void user_enters_all_required_Information() throws Throwable {
		
		project.EnterProjectName();
		project.EnterProjectOverView();
		project.EnterProjectManagerName();
		project.EnterMakerName();
		project.EnterProjectPriority();
		project.EnterComment1();
		project.EnterComment2();
		
	   
	}

	@Given("^User clicks on Save Button$")
	public void user_clicks_on_Save_Button() throws Throwable {
		
		project.SaveProjectCode();
	    
	}

}
