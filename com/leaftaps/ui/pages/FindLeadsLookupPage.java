package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class FindLeadsLookupPage  extends ProjectrelatedMethods{

	public FindLeadsLookupPage(RemoteWebDriver driver) {
	this.driver=driver;
	}
	public FindLeadsLookupPage enterw1firstName(String w1firstName) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(w1firstName);
		return this;

	}
	public FindLeadsLookupPage enterw2firstName(String w2firstName) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(w2firstName);
		return this;

	}
	
	
//	public FindLeadsLookupPage enterLeadID(String leadID) {
//		
//		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
//		return this;
//
//	}
	
	public FindLeadsLookupPage clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
				
	}
	public FindLeadsLookupPage getLeadsID() throws InterruptedException {
		Thread.sleep(2000);
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		 System.out.println(leadID);
		 return this;
	}
	
	public MergeLeadsPage clickFirstLeadID() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return  new MergeLeadsPage(driver);
	}
	
}

