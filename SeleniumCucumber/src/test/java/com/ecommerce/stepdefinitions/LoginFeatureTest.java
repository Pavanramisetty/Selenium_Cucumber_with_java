package com.ecommerce.stepdefinitions;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.bidi.log.Log;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.LoginPage;

public class LoginFeatureTest {
	@Test
	public void LoginFeatureTest() {
		TestSuite.driver.get(DataFile.homePageURL);
		TestSuite.driver.navigate().refresh();
		HomePage.accountSigninButton().click();
        LoginPage.usernameOrEmailField(TestSuite.driver).sendKeys(DataFile.username);
        LoginPage.continueButton(TestSuite.driver).click();
		LoginPage.passwordField(TestSuite.driver).sendKeys(DataFile.password);
		LoginPage.rememberMeCheckBox(TestSuite.driver).click();
		LoginPage.submitButton(TestSuite.driver).click();
		
        assertEquals(DataFile.user, HomePage.accountSigninButton().getText());
	}
}
