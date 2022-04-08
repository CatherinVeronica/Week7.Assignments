package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class LeadPage  extends ProjectrelatedMethods{

	public LeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public LeadPage verifyLeadID() {
		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text);
		return this;

	}
}

