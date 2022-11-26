package com.fdmgroup.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Runner {
	//static WebDriver driver;
	
	public static void main(String[] args) {
		DriverUtilities driverUtilites = DriverUtilities.getInstance();
		WebDriver driver = driverUtilites.getDriver();
	}
}
