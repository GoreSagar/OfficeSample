package com.pvmsys.stepDefinitions;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.pvmsys.pageObjects.LoginPage;

import cucumber.api.java.en.Given;

public class LoginSteps {
	
	LoginPage login;
	
	public LoginSteps()
	{
		login= new LoginPage(new FirefoxDriver());
	}
	
	@Given("^when user is on login page$")
	public void when_user_is_on_login_page() throws Throwable 
	{
				login.LoginPage();
	}

	@Given("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		
		login.UserNameTextBox();
		login.PasswordTextBox();
	}
	
	@Given("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	
		login.ClickLoginButton();
		
	}

	@Given("^user should be on homepage$")
	public void user_should_be_on_homepage() throws Throwable 
	{
		
		login.getCurrentURL();
		
	    
	}


	

}
