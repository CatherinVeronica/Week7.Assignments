package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectrelatedMethods;

public class MergeLeadsPage  extends ProjectrelatedMethods{

	public MergeLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public FindLeadsLookupPage clickfromLeadLookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsLookupPage(driver);
	}
	
	public FindLeadsLookupPage clickToLeadLookup() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsLookupPage(driver);
	}
	
	
	
	public MergeLeadsPage clickMergeButton() {
		driver.findElement(By.linkText("Merge")).click();
		return this;
				
	}
	public MergeLeadsPage getLeadsID() throws InterruptedException {
		Thread.sleep(2000);
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		 System.out.println(leadID);
		 return this;
	}
	
	
	public ViewLeadPage acceptalert() {
		driver.switchTo().alert().accept();
		return new ViewLeadPage(driver);

	}
	
}

