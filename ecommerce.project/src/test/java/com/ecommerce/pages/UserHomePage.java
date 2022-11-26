package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserHomePage {
	
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
	}
	
	public static WebElement searchBar(WebDriver driver) {
		return driver.findElement(By.id("twotabsearchtextbox"));
	}
	
	public static WebElement logout(WebDriver driver) {
		return driver.findElement(By.id("nav-link-accountList"));
	}
	
	public static WebElement homeButton(WebDriver driver) {
		return driver.findElement(By.id("nav-logo-sprites"));
	}
	
	public static WebElement selectItem(WebDriver driver) {
		return driver.findElement(By.linkText("Insignia 58\" 4K UHD HDR LCD Smart TV (NS-58F301CA22) - Fire TV Edition - 2021"));
	}
}
