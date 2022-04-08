package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import base.ProjectrelatedMethods;

public class TC002_DuplicateLead extends ProjectrelatedMethods {
	@BeforeTest
	public void SetData() {
		excelfilepath = ("./TestData/tc002.xlsx");
	}
	
	@Test(dataProvider="Dynamic_data")
	public void runTC002(String username, String password, String phoneNumber) throws InterruptedException {
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
	.clickFirstLeadID()
	.clickDuplicateButton()
	.clickUpdateButton();

	}
}
