package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserProfilePage {
	
	public static WebElement userAddressbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//div[contains(@data-card-identifier, 'AddressesAnd1Click_C')]"));
	}
}
