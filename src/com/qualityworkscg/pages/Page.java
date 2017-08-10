package com.qualityworkscg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
  
  protected WebDriver driver;
  
  public static final String SERVICES_LOCATOR = "a[title='Services']";
  public static final String MOBILE_AUTOMATION_LOCATOR = "a[title='Mobile & Web Test Automation']";
  public static final String DEVOPS_CONSULTANCY_LOCATOR = "a[title='DevOps Consultancy']";
  public static final String SOFTWARE_DEVELOPMENT_LOCATOR ="a[title='Software Development Consultancy']";
  public static final String AGILE_COACHING_LOCATOR = "a[title='Agile Coaching']";
  
  public Page(WebDriver driver) {
    this.driver = driver;
  }

  public void navigate(String url) {
    driver.navigate().to(url);
  }
  
  public String getTitle() {
    return driver.getTitle();
  }
  
  //Function to click the Services dropdown
  public void clickServices(){
	  WebElement pageElement = driver.findElement(By.cssSelector(SERVICES_LOCATOR));
	  pageElement.click();
	}
  
  //Function to click the Mobile Automation dropdown
  public void clickMobileAutomation(){
	  WebElement pageElement = driver.findElement(By.cssSelector(MOBILE_AUTOMATION_LOCATOR));
	  pageElement.click();
	}
  
  //Function to click the DevOps Consultancy dropdown
  public void clickDevOpsConsultancy(){
	  WebElement pageElement = driver.findElement(By.cssSelector(DEVOPS_CONSULTANCY_LOCATOR));
	  pageElement.click();
	}
  
  //Function to click the Software Development dropdown
  public void clickSoftwareDevelopment(){
	  WebElement pageElement = driver.findElement(By.cssSelector(SOFTWARE_DEVELOPMENT_LOCATOR));
	  pageElement.click();
	}
  
  //Function to click the Agile Coaching dropdown
  public void clickAgileCoaching(){
	  WebElement pageElement = driver.findElement(By.cssSelector(AGILE_COACHING_LOCATOR));
	  pageElement.click();
	}

  public void tearDown() {
    try {
      this.driver.quit();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
}
