package com.syntax.orangeHRM.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class initClass {
	WebDriver driver;
	
	@BeforeMethod
	@BeforeTest
	public void setUp() {
		driver= new ChromeDriver();
		
		
	}
	
	
	@Test
	public void testRun() {
		driver.get("http://google.com");
		String title=driver.getTitle();
		AssertJUnit.assertEquals(title, "Google");
	}
	
	@AfterTest
	public void finish() {
	driver.quit();	
	}
}
