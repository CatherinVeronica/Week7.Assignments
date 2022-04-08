package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class CreateLeadPage  extends ProjectrelatedMethods{

	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public CreateLeadPage enterCompanyName(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
return this;
	}
	public CreateLeadPage enterFirstName(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}
	public CreateLeadPage enterLastName(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;

	}
	public LeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new LeadPage(driver);

	}
}

