package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AddEmergencyC extends CommonMethods{
	@Given("As an admin I should be able to logged in")
	public void as_an_admin_I_should_be_able_to_logged_in() {
	    sendText(login.username, ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	    click(login.loginBtn);
	}

	@Given("click on employee list through PIM")
	public void click_on_employee_list_through_PIM() {
	   jsClick(dashboard.PIM); 
	   jsClick(dashboard.empListPage);
	}

	@Given("enter id {string} and click on search")
	public void enter_id_and_click_on_search(String string) {
	   sendText(emergency.empId, string);
	   wait(3);
	   jsClick(emergency.searchBtn);
	   
	}

	@Given("clik on employee id")
	public void clik_on_employee_id() {
	   jsClick(emergency.clickemp);
	}

	@Given("click on emergency contacts and click on add button")
	public void click_on_emergency_contacts_and_click_on_add_button() {
	    jsClick(emergency.clickempEmgC);
	    jsClick(emergency.addBtn);
	}

	@When("add emergency contacts {string}, {string}, {string}, {string}, {string}")
	public void add_emergency_contacts(String name, String Relationship, String HomeTelephone, String Mobile, String WorkTelephone) {
	  sendText(emergency.addempName, name);
	  wait(1);
	  sendText(emergency.relation, Relationship);
	  wait(1);
	  sendText(emergency.hometel, HomeTelephone);
	  wait(1);
	  sendText(emergency.mobNum, Mobile);
	  wait(1);
	  sendText(emergency.workPhone, WorkTelephone);
	
	  wait(2);
	  jsClick(emergency.Savebtn);
	}

	
}
