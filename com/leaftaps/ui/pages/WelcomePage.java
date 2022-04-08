package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class WelcomePage  extends ProjectrelatedMethods{

	public WelcomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);

	}
	public WelcomePage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;

	}
}

