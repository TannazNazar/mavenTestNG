package com.syntax.orangeHRM.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		
	}
	
	
	@Test
	public void testRun() throws InterruptedException {
		driver.get("http://google.com");
		String title=driver.getTitle();
		AssertJUnit.assertEquals(title, "Google");
		driver.findElement(By.name("q")).sendKeys("restaurant in fairfax");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(10000);
//		driver.findElement(By.name("btnK")).click();
	}
	
	@AfterTest
	public void finish() {
	driver.quit();	
	}
}
