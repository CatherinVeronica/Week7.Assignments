package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class ViewLeadPage  extends ProjectrelatedMethods{

	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	
	


	public EditLeadPage clickEditButton() {
		
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
public DuplicateLeadPage clickDuplicateButton() {
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
public MyLeadsPage clickDeleteButton() {
	driver.findElement(By.linkText("Delete")).click();
	return new MyLeadsPage(driver);

}
public FindLeadsPage clickFindLeadsTab() {
	driver.findElement(By.linkText("Find Leads")).click();
	return new FindLeadsPage(driver);

}


	
}

