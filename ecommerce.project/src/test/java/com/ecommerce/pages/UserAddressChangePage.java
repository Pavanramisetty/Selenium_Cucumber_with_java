package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAddressChangePage {

	public static WebElement addingNewAddressToTheUser(WebDriver driver) {
		return driver.findElement(By.xpath("//div[contains(@class, 'address-plus')]"));
	}
	
	public static WebElement fullName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[contains(@id, 'AddressFullName')]"));
	}
	
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//input[contains(@type, 'submit')]"));
	}
}
