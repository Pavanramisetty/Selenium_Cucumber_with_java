package com.fdmgroup.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.BeforeAll;

public class BasicWebDriverCommandsDemo {
	
	static DriverUtilities driverUtilites;
	static WebDriver driver;
	
	@BeforeClass
	public static void init() {
		// Initialise WebDriver
		driverUtilites = DriverUtilities.getInstance();
		driver = driverUtilites.getDriver();
	}
	
	@Test
	public void navigationCommandsTest() throws InterruptedException {
		
		// Opening 1st window - google
		driver.get("https://www.google.com/");
		String window1 = driver.getWindowHandle();				// 1st window handle
		System.out.println(window1);
		
		// Open 2nd window
		driver.switchTo().newWindow(WindowType.WINDOW);
		String window2 = driver.getWindowHandle();				// 1st window handle
		System.out.println(window2);
		
		driver.navigate().to("http://www.facebook.com/");
		
		// Switch window
		driver.switchTo().window(window1);
		
		// driver.close - window1
		driver.close();
		
		// Switch window 2
		driver.switchTo().window(window2);
		
		// Navigation
		driver.navigate().to("https://www.fdmgroup.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}
	
	@Test
	public void browserCommandsTest() {
		// maximize browser
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		assertEquals("Recruit Train Deploy | FDM Group", title);
		
		String URL = driver.getCurrentUrl();
		System.out.println("URL: " + URL);
	
		//assertEquals("https://www.fdmgroup.com/", URL);
	}
	
	@Test
	public void capabilitiesCommandsTest() {
		String browserName = ((RemoteWebDriver) driver).getCapabilities().getBrowserName();
		System.out.println("Browser Name: " + browserName);
		
		String browserVersion = ((RemoteWebDriver) driver).getCapabilities().getBrowserVersion();
		System.out.println("Browser Version: " + browserVersion);
	}
	
	@Test
	public void takingScreenshotsTest() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scrFile, new File("src/test/resources/images/screenshot1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
