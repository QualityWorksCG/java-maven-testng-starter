package com.qualityworkscg.pages;

import org.openqa.selenium.WebDriver;

public class Page {
  
  protected WebDriver driver;
  
  public Page(WebDriver driver) {
    this.driver = driver;
  }

  public void navigate(String url) {
    driver.navigate().to(url);
  }
  
  public String getTitle() {
    return driver.getTitle();
  }

  public void tearDown() {
    try {
      this.driver.quit();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
}
