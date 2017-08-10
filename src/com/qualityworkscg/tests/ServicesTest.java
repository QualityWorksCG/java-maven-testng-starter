package com.qualityworkscg.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServicesTest extends AbstractTest{
	
	@Test
	//Function to verify that the Mobile Automation drop down navigates to the correct page.
	public void verifyNavigationMobileAutomation () {
      page.clickServices();
	  page.clickMobileAutomation();
	  Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Mobile and Web Automation", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	//Function to verify that the DevOps Consultancy drop down navigates to the correct page.
	public void verifyNavigationDevOpsConsultancy () {
	  page.clickServices();
	  page.clickDevOpsConsultancy();
	  Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | DevOps Consultancy", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	//Function to verify that the Software Development drop down navigates to the correct page.
	public void verifyNavigationSoftwareDevelopment () {
	  page.clickServices();
	  page.clickSoftwareDevelopment();
	  Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Software Development Consultancy", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	//Function to verify that the Agile Coaching drop down navigates to the correct page.
	public void verifyNavigationAgileCoaching () {
	  page.clickServices();
	  page.clickAgileCoaching();
	  Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Agile Coaching and Training", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}

}
