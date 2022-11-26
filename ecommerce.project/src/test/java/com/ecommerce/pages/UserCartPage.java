package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserCartPage {
	
	public static  WebElement cartButton(WebDriver driver) {
		return driver.findElement(By.id("nav-cart-count-container"));
	}
	
	public static WebElement cartCount(WebDriver driver) {
		return driver.findElement(By.id("nav-cart-count"));
	}
	
	public static WebElement cartItem(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@class, 'a-truncate-cut')]"));
	}
	
	public static WebElement quantity(WebDriver driver) {
         return driver.findElement(By.name("quantity"));		
	}
	
	public static WebElement deleteItemsInCart(WebDriver driver) {
		return driver.findElement(By.xpath("//input[contains(@value, 'Delete')]"));
	}
	
	public static WebElement emptyCart(WebDriver driver) {
		return driver.findElement(By.id("nav-cart-count"));
	}

}
