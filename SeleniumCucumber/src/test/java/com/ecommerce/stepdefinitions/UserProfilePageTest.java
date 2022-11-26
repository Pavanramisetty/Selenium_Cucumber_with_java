package com.ecommerce.stepdefinitions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.UserAddressChangePage;
import com.ecommerce.pages.UserHomePage;
import com.ecommerce.pages.UserProfilePage;

public class UserProfilePageTest {

	@Test
	public void navigateToUserProfle() {
		UserHomePage.homeButton(TestSuite.driver).click();
		TestSuite.actions.moveToElement(HomePage.accountSigninButton()).perform();
		HomePage.userAccount().click();
	}
	
	@Test
	public void userAddressbutton() {
		UserProfilePage.userAddressbutton(TestSuite.driver).click();
		assertTrue(TestSuite.driver.getCurrentUrl().contains(DataFile.addressVerify));
	}
}
