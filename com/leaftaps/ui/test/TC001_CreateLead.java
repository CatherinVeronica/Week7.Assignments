package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import base.ProjectrelatedMethods;

public class TC001_CreateLead extends ProjectrelatedMethods {
	@BeforeTest
	public void SetData() {
		excelfilepath = ("./TestData/tc001.xlsx");
	}
	
	@Test(dataProvider="Dynamic_data")
	public void runTC001(String username, String password, String companyname, String firstname, String lastname) {
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLoginButtonPositive()
	.clickCRMSFA()
	.clickLeadsTab()
	.clickCreateLead()
	.enterCompanyName(companyname)
	.enterFirstName(firstname)
	.enterLastName(lastname)
	.clickCreateLeadButton()
	.verifyLeadID();
	
	
	
	}
}
