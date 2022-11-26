package com.fdmgroup.ecommerce.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EcommerceAddItemTest {
	static DriverUtilities dutilities;
	static WebDriver driver;
	static Properties config;
	static String username;
	static String password;
	static String url;

	@BeforeClass
	public static void init() throws InterruptedException {
		dutilities = dutilities.getInstance();
		config = new Properties();
		try {
			config.load(new FileInputStream("src/test/resources/config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		username = config.getProperty("username");
		password = config.getProperty("password");
		url = config.getProperty("Url");

		driver = dutilities.login(url, username, password);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void LoginTest() throws InterruptedException {
		String loggedInUser = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
		assertEquals("Hello, Lavanya", loggedInUser);
	}

	@Test
	public void searchItembyItemName() {
		String item = config.getProperty("SearchItem");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item + Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		assertTrue(currentUrl.contains(item));
	}

	@Test
	public void logout() {
		WebElement userAccount = driver.findElement(By.id("nav-link-accountList"));
		Actions actions = new Actions(driver);
		actions.moveToElement(userAccount).perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

}
