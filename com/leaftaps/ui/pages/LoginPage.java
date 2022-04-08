package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class LoginPage  extends ProjectrelatedMethods{

	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
return this;
	}
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public WelcomePage clickLoginButtonPositive() {
		driver.findElement(By.className("decorativeSubmit")).click();
return new WelcomePage(driver);
	}
	public LoginPage clickLoginButtonNegative() {
		driver.findElement(By.className("decorativeSubmit")).click();
return this;
	}
}

