package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemSpecificationPage {
	
	@FindBy(id="productTitle")
	static WebElement productTitle;
	
	public static WebElement productTitle(WebDriver driver) {
		return productTitle;
	}

	public static List<WebElement> hoverTheMouseOnTheItems(WebDriver driver) {
		return driver.findElements(By.xpath("//li[contains(@data-csa-c-action, \"image-block-alt-image-hover\")]"));
	}
	
	public static WebElement imageWrapper(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"imgTagWrapperId\"]"));
	}
	
	public static WebElement inStock(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='availability']/span"));
	}
	
	public static WebElement addToCart(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	}
}
