package com.hrms.steps;

//is block of code that gets executed before and after each scenario
//@Before and @After  
//when preconditions and postcondition are same for all scenarios
//Hooks applicable for all scenarios within the project while backgroup 
//for all scenarios within particular feature file 

//So, Hook is generic for the project and background is feature specific.

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void start() {
		BaseClass.setUp();
	}
	
	@After
	public void end(Scenario scenario) {
		
		byte[] pic;
		if(scenario.isFailed()) {
			pic=CommonMethods.takeScreenShotCucumber("failed/"+scenario.getName());
		}else {
			pic=CommonMethods.takeScreenShotCucumber("passed/"+scenario.getName());
		}
		
		scenario.attach(pic, "image/png", scenario.getName());
		
		BaseClass.tearDown();
	}
}