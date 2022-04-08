package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import base.ProjectrelatedMethods;

public class TC003_DeleteLead extends ProjectrelatedMethods {
	@BeforeTest
	public void SetData() {
		excelfilepath = ("./TestData/tc003.xlsx");
	}
	
	@Test(dataProvider="Dynamic_data")
	public void runTC003(String username, String password, String phoneNumber) throws InterruptedException {
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLoginButtonPositive()
	.clickCRMSFA()
	.clickLeadsTab()
	.clickFindLeadstab()
	.clickPhoneNumberTab()
	.enterPhoneNumber(phoneNumber)
	.clickFindLeadsButton()
	.getLeadsID()
	.clickFirstLeadID()
	.clickDeleteButton()
	.clickfindleadstabfrommyleads()
	.enterLeadID(leadID)
	.clickFindLeadsButton()
	.norecordsassertion();

	}
}
