package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class HomePage  extends ProjectrelatedMethods{

	public HomePage(RemoteWebDriver driver) {
		this.driver= driver;
	}
	
	public LeadsPage clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);

	}
}

