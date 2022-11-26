package com.ecommerce.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.ecommerce.driverutilities.DriverUtilities;

@RunWith(Suite.class)
@SuiteClasses({
	LoginFeatureTest.class,
	SearchFeatureTest.class,
	ItemSpecificatonTest.class,
	UserCartPageTest.class,
	UserProfilePageTest.class,
	UserAddressChangePageTest.class,
	LogoutTest.class
})
public class TestSuite {

	static DriverUtilities driverUtilities;
	static WebDriver driver;
	static Actions actions;
	
	@BeforeClass
	public static void init() {
		driverUtilities = driverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		actions = new Actions(driver);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
	
}
