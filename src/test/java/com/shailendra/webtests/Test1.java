package com.shailendra.webtests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	WebDriverWait wait;
  @Test
  public void openGoogle() {
	  driver.get("https://www.google.com/");
	  System.out.println("The page title : " + driver.getTitle());
	  System.out.println("The page url : " + driver.getCurrentUrl());
	  System.out.println("added one line");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  if (driver!=null) {
		  driver.quit();
	  }
  }

}
