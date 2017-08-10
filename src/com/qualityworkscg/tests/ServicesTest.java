package com.qualityworkscg.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServicesTest extends AbstractTest{
	
	@Test
	//Function to verify that the Mobile Automation drop down navigates to the correct page.
	public void verifyNavigationMobileAutomation () throws InterruptedException{
		page.clickServices();
		Thread.sleep(1000);
		page.clickMobileAutomation();
		Thread.sleep(2000);
		Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Mobile and Web Automation", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	//Function to verify that the DevOps Consultancy drop down navigates to the correct page.
	public void verifyNavigationDevOpsConsultancy () throws InterruptedException{
		page.clickServices();
		Thread.sleep(1000);
		page.clickDevOpsConsultancy();
		Thread.sleep(2000);
		Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | DevOps Consultancy", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	//Function to verify that the Software Development drop down navigates to the correct page.
	public void verifyNavigationSoftwareDevelopment () throws InterruptedException{
		page.clickServices();
		Thread.sleep(1000);
		page.clickSoftwareDevelopment();
		Thread.sleep(2000);
		Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Software Development Consultancy", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	//Function to verify that the Agile Coaching drop down navigates to the correct page.
	public void verifyNavigationAgileCoaching () throws InterruptedException{
		page.clickServices();
		Thread.sleep(1000);
		page.clickAgileCoaching();
		Thread.sleep(2000);
		Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Agile Coaching and Training", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}

}
