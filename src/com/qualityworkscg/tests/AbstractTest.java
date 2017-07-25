package com.qualityworkscg.tests;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qualityworkscg.pages.Page;

public abstract class  AbstractTest {
  
  protected static Page page;
  
  @BeforeTest
  @Parameters({"url"})
  public void setup(String url) {
    // Set the path to the geckodriver
    System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
    
    // Instantiate a new Page and navigate 
    // to the url specified in the testng.xml
    page = new Page(new FirefoxDriver());
    page.navigate(url);
  }

  @AfterTest
  public void afterTest() {
    page.tearDown();
  }
}
