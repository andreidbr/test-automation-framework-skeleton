package com.andreidobra;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrontEndUiTests {

  private static final Logger LOGGER = LogManager.getLogger(FrontEndUiTests.class);

  WebDriver driver;

  @BeforeMethod
  public void setup() {
    driver = new ChromeDriver();
  }

  @AfterMethod
  public void teardown() {
    driver.quit();
  }

  @Test
  public void basicFrontEndTest() {
    LOGGER.info("Running basic frontend test");
    driver.get("https://andreidobra.com");

    Assert.assertTrue(driver.getTitle().contains("Andrei Dobra"),
        "Page title did not include expected text");
  }


}
