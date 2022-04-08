package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class LeadsPage  extends ProjectrelatedMethods{

	public LeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}
	public FindLeadsPage clickFindLeadstab()  {
		driver.findElement(By.linkText("Find Leads")).click();
				return new FindLeadsPage(driver);

	}
	public MergeLeadsPage clickMergeLeadsTab() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);

	}
}

