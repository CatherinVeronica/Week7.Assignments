package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import base.ProjectrelatedMethods;

public class TC005_MergeLead extends ProjectrelatedMethods {
	@BeforeTest
	public void SetData() {
		excelfilepath = ("./TestData/tc005.xlsx");
	}
	
	@Test(dataProvider="Dynamic_data")
	public void runTC004(String username, String password,String w1firstName,String w2firstName) throws InterruptedException {
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLoginButtonPositive()
	.clickCRMSFA()
	.clickLeadsTab()
	.clickMergeLeadsTab()
	.clickfromLeadLookup()
	.enterw1firstName(w1firstName)
	.clickFindLeadsButton()
	.getLeadsID()
	.clickFirstLeadID()
	.clickToLeadLookup()
	.enterw2firstName(w2firstName)
	.clickFindLeadsButton()
	.clickFirstLeadID()
	.clickMergeButton()
	.acceptalert()
	.clickFindLeadsTab()
	.enterLeadID(leadID)
	.clickFindLeadsButton()
	.norecordsassertion();


	}
}
