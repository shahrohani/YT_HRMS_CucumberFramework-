package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class EmergencyElements extends CommonMethods {

	@FindBy(id="empsearch_employee_name_empName")
	public WebElement empName;
		
	@FindBy(id="empsearch_id")
	public WebElement empId;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(linkText="12589")
	public WebElement clickemp;
	
	@FindBy(xpath="//*[@id=\"sidenav\"]/li[3]/a")
	public WebElement clickempEmgC;
	
	@FindBy (id="btnAddContact")
	public WebElement addBtn;
	
	@FindBy (id="emgcontacts_name")
	public WebElement addempName;
	
	@FindBy (id="emgcontacts_relationship")
	public WebElement relation;
	
	@FindBy (id="emgcontacts_homePhone")
	public WebElement hometel;
	
	@FindBy (id="emgcontacts_mobilePhone")
	public WebElement mobNum;
	
	@FindBy (id="emgcontacts_workPhone")
	public WebElement workPhone;
	
	@FindBy (id="btnSaveEContact")
	public WebElement Savebtn;
	
	
	public  EmergencyElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
