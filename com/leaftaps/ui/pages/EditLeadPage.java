package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class EditLeadPage  extends ProjectrelatedMethods{

	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage updateCompanyName(String UpdatedCompanyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(UpdatedCompanyName);
				return this;
				
	}
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}
}

