package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class MyLeadsPage  extends ProjectrelatedMethods{

	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public MyLeadsPage verifyLeadID() {
		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text);
		return this;

	}
	public FindLeadsPage clickfindleadstabfrommyleads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);

	}
	
}

