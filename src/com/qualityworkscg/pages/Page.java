package com.qualityworkscg.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
  
  protected WebDriver driver;
  WebDriverWait wait;
  
  public static final String SERVICES_LOCATOR = "a[title='Services']";
  public static final String MOBILE_AUTOMATION_LOCATOR = "a[title='Mobile & Web Test Automation']";
  public static final String DEVOPS_CONSULTANCY_LOCATOR = "a[title='DevOps Consultancy']";
  public static final String SOFTWARE_DEVELOPMENT_LOCATOR ="a[title='Software Development Consultancy']";
  public static final String AGILE_COACHING_LOCATOR = "a[title='Agile Coaching']";
  
  public Page(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait (driver, 10);
  }

  public void navigate(String url) {
    driver.navigate().to(url);
  } 
  
  public String getTitle() {
    return driver.getTitle();
  }
  
  //Function to click the Services dropdown
  public void clickServices() throws InterruptedException{
	  WebElement pageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(SERVICES_LOCATOR)));
	  pageElement.click();
  }
  
  //Function to click the Mobile Automation dropdown
  public void clickMobileAutomation() throws InterruptedException{  
	  //wait = new WebDriverWait (driver, 10);
	  WebElement pageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(MOBILE_AUTOMATION_LOCATOR)));
	  pageElement.click();
  }
  
  //Function to click the DevOps Consultancy dropdown
  public void clickDevOpsConsultancy() throws InterruptedException{
	  WebElement pageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DEVOPS_CONSULTANCY_LOCATOR)));
	  pageElement.click();
  }
  
  //Function to click the Software Development dropdown
  public void clickSoftwareDevelopment() throws InterruptedException{
	  WebElement pageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(SOFTWARE_DEVELOPMENT_LOCATOR)));
	  pageElement.click();
  }
  
  //Function to click the Agile Coaching dropdown
  public void clickAgileCoaching() throws InterruptedException{
	  WebElement pageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AGILE_COACHING_LOCATOR)));
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
