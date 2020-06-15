package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddMembership extends CommonMethods {

	@FindBy(id="btnAdd")
	public WebElement addbtn;
	
	@FindBy(id="membership_name")
	public WebElement name;
	
	@FindBy(id="btnSave")
	public WebElement savebtn;
	
	public AddMembership() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
