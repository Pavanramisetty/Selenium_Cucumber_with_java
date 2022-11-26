package com.ecommerce.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.driverutilities.DriverUtilities;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.ItemSpecificationPage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.UserAddressChangePage;
import com.ecommerce.pages.UserCartPage;
import com.ecommerce.pages.UserHomePage;
import com.ecommerce.pages.UserProfilePage;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hook {
	static DriverUtilities driverUtilities;
	static WebDriver driver;
	static Actions actions;

	@BeforeAll
	public static void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		actions = new Actions(driver);
		
		// Initialize the implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Initialize Page Factory
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, ItemSpecificationPage.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, UserAddressChangePage.class);
		PageFactory.initElements(driver, UserCartPage.class);
		PageFactory.initElements(driver, UserHomePage.class);
		PageFactory.initElements(driver, UserProfilePage.class);
	}

	@AfterAll
	public static void tearDown() {
		driver.quit();
	}
}
