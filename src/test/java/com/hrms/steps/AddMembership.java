package com.hrms.steps;

import javax.swing.JScrollBar;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddMembership extends CommonMethods {
	@Given("click on Qualifications through Admin and click on memberships")
	public void click_on_Qualifications_through_Admin_and_click_on_memberships() {
	    jsClick(dashboard.admin);
	    jsClick(dashboard.qualifications);
	    jsClick(dashboard.membership);
	    wait(2);
	}

	@Given("click on Add button")
	public void click_on_Add_button() {
	   click(am.addbtn);
	}

	@Then("Enter {string} and click on save button")
	public void enter_and_click_on_save_button(String string) {
	    sendText(am.name, string);
	    click(am.savebtn);
	    wait(2);
	}
}