package com.fdmgroup.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatingElementsDemo {
	static DriverUtilities driverUtilites;
	static WebDriver driver;

	@BeforeClass
	public static void init() {
		// Initialise WebDriver
		driverUtilites = DriverUtilities.getInstance();
		driver = driverUtilites.getDriver();
		
		
	}

	@Test
	public void locatingElementTest() throws InterruptedException {
		// Go to website
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();

		// Locate by ID - signinButton
		WebElement signInButton = driver.findElement(By.id("signin_button"));
		System.out.println("SignInButton Text: " + signInButton.getText());

		// Click
		signInButton.click();

		// 2 ByName Locator - Locating UserName
		WebElement userNameField = driver.findElement(By.name("user_login"));
		userNameField.sendKeys("username");

		// 3 By CSS Locator
		List<WebElement> results = driver.findElements(By.cssSelector("ul > li"));
		for (WebElement result : results) {
			System.out.println("Element ByCSSSelector: " + result.getText());
		}

		// 4 Go back to index page - locate the search bar
		driver.get("http://zero.webappsecurity.com/index.html");
		WebElement result = driver.findElement(By.className("search-query"));
		System.out.println("Element ByClassName: " + result.getTagName());

		// 5 By Tag Name
		WebElement resultTagName = driver.findElement(By.tagName("h4"));
		System.out.println("Element ByTagName: " + resultTagName.getText());

		// 6 By Link Text
		driver.navigate().back();
		WebElement resultLinkText = driver.findElement(By.linkText("Forgot your password ?"));
		System.out.println("Element ByLinkText: " + resultLinkText.getText());

		// 7 By Partial Link Text
		WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("Forgot"));
		forgotPasswordLink.click();

		// 8 ByXPath
		driver.get("http://zero.webappsecurity.com/index.html");

		// 8a Absolute XPath
		WebElement siginInButton1 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/ul/li[2]/button"));
		System.out.println("Element By Absolute XPath: " + siginInButton1.getText());

		// 8b Relative XPath
		WebElement siginInButton2 = driver.findElement(By.xpath("//*[@id='signin_button']"));
		System.out.println("Element By Relative XPath: " + siginInButton2.getText());

		// Thread.sleep(2000);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
