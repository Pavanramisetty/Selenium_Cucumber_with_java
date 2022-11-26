package com.ecommerce.stepdefinitions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.UserHomePage;

public class LogoutTest {
	
	@Test
	public void Logout() {
		UserHomePage.homeButton(TestSuite.driver).click();
		TestSuite.actions.moveToElement(HomePage.accountSigninButton()).perform();
		HomePage.signOut().click();
	}

}
