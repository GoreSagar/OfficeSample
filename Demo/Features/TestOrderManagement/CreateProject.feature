@CreateProject
Feature: To check if user can create project

Background: Login to Application
*  when user is on login page
*  user enters username and password
*  user clicks on login button

@CreateProjectwithProjectName
Scenario: CheckUserCanCreateProject
* User selects Test Order Management Tab
* User clicks on Add Project Button
* User enters all required Information
* User clicks on Save Button
