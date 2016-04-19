package com.pvmsys;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="Features",
		glue="com/pvmsys/stepDefinitions",
		tags= {"~@skip"}
)

public class CucumberDemo {
	


}
 