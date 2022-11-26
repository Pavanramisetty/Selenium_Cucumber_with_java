package com.fdmgroup.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
