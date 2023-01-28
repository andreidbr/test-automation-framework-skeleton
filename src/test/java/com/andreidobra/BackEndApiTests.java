package com.andreidobra;

import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class BackEndApiTests {

  private static final Logger LOGGER = LogManager.getLogger(BackEndApiTests.class);

  @Test
  public void basicBackEndTest() {
    LOGGER.info("Running basic backend test");
    RestAssured
        .given()
        .header("Accept", "application/json")
        .when()
        .get("https://andreidobra.com")
        .then()
        .assertThat().statusCode(200);
  }

}
