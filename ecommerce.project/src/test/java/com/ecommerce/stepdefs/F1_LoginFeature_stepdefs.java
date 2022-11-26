package com.ecommerce.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F1_LoginFeature_stepdefs {
	
	
	@Given("User launches the amazon site home page")
	public void user_launches_the_amazon_site_home_page() {
	    Hook.driver.get(DataFile.homePageURL);
	    Hook.driver.navigate().refresh();
	}

	@Given("Account signbuton should be displayed")
	public void account_signbuton_should_be_displayed() {
		assertTrue(HomePage.accountSigninButton().isDisplayed());
	}

	@When("User click on account signin button")
	public void user_click_on_account_signin_button() {
		HomePage.accountSigninButton().click();
	}

	@When("User should navigate to username page")
	public void user_should_navigate_to_username_page() {
		assertTrue(LoginPage.usernameOrEmailField().isDisplayed());
	}
	
	@When("User should see the {string} field")
	public void user_should_see_the_field(String username) {
		LoginPage.usernameOrEmailField().sendKeys(username);
	}


	@When("User should see the continue button")
	public void user_should_see_the_continue_button() {
		assertTrue(LoginPage.continueButton().isDisplayed());
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		LoginPage.continueButton().click();
	}

	@When("User should see the password field")
	public void user_should_see_the_password_field() {
		LoginPage.passwordField().sendKeys(DataFile.password);
	}

	@When("User should see the Keep me sign in checkbox")
	public void user_should_see_the_keep_me_sign_in_checkbox() {
		LoginPage.rememberMeCheckBox().click();
	}
	   
	@When("User should click Signin buton")
	public void user_should_see_the_signin_buton() {
		LoginPage.submitButton().click();
	}

	@Then("User should Land on Ecomerce amazon User Home page")
	public void user_should_land_on_ecomerce_amazon_user_home_page() {
		assertEquals(DataFile.user, HomePage.accountSigninButton().getText());
	}
}
