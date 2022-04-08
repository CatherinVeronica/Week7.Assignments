package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class DuplicateLeadPage  extends ProjectrelatedMethods{

	public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver= driver;
	}
	
	
				
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}
}

