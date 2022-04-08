package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class FindLeadsPage  extends ProjectrelatedMethods{

	public FindLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public FindLeadsPage clickPhoneNumberTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;

	}
	public FindLeadsPage enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
return this;
	}
	
	public FindLeadsPage enterLeadID(String leadID) {
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;

	}
	
	public FindLeadsPage clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
				
	}
	public FindLeadsPage getLeadsID() throws InterruptedException {
		Thread.sleep(2000);
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		 System.out.println(leadID);
		 return this;
	}
	
	public ViewLeadPage clickFirstLeadID() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return  new ViewLeadPage(driver);
	}
	public void norecordsassertion() {
		String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if (text.equalsIgnoreCase("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}
}

