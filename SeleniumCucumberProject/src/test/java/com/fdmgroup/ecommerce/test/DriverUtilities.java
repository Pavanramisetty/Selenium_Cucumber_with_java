package com.fdmgroup.ecommerce.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Built using Singleton Pattern
public class DriverUtilities {
	// 1 Private static attributes of your own
	private static DriverUtilities driverUtil;
	private WebDriver driver;

	// 2 Private Constructor
	public DriverUtilities() {
		super();
	}

	// 3 Public static getter
	public static DriverUtilities getInstance() {
		if (driverUtil == null) {
			driverUtil = new DriverUtilities();
		}

		return driverUtil;
	}

	public WebDriver getDriver() {
		if (driver == null) {
			// create driver
			createDriver();
		}

		return driver;
	}

	private void createDriver() {
		// Read property file
		String browserName = getDriverName();

		switch (browserName) {
		case "Google Chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
	}

	private String getDriverName() {
		Properties config = new Properties();
		String driverName = "";

		// Reading config file
		try {
			config.load(new FileInputStream("src/test/resources/config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Getting driver name
		driverName = config.getProperty("Browser");

		return driverName;
	}

	public WebDriver login(String Url, String username, String password) throws InterruptedException {
		driver = getDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("rememberMe")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("signInSubmit")).click();
//		String twoFactorAuthentication = driver.findElement(By.xpath("//*[@id='body']/div/div/div[2]/span")).getText();
//		String expectedStrngFor2FA = "For your security, approve the notification sent to:"; //checking the condition for two factor auth
//		if (twoFactorAuthentication.equals(expectedStrngFor2FA)) {
//			Thread.sleep(60);
//		    return driver;
//		}
//		else
			return driver;
	}
}
