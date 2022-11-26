package com.ecommerce.stepdefs;

import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.UserHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class F7_LogoutFeature_stepdefs {
	@Given("Should be navigate to user home page")
	public void should_be_navigate_to_user_home_page() {
	    UserHomePage.homeButton(Hook.driver).click();
	}

	@Given("Hover the mouse on accounts and list page to see the singout option")
	public void hover_the_mouse_on_accounts_and_list_page_to_see_the_singout_option() {
	    Hook.actions.moveToElement(HomePage.accountSigninButton()).perform();
	}

	@When("click on signout button")
	public void click_on_signout_button() {
		HomePage.signOut().click();
	}

}
