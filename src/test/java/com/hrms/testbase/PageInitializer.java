package com.hrms.testbase;

import com.hrms.pages.AddMembership;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmergencyElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.steps.AddEmergencyC;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	
	public static DashboardPageElements dashboard;
	
	public static EmergencyElements emergency;
	
	public static AddMembership am;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		emergency=new EmergencyElements();
		am=new AddMembership();
		
	}
}