package com.ecommerce.stepdefs;

import static org.junit.Assert.assertTrue;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.UserAddressChangePage;
import com.ecommerce.pages.UserHomePage;
import com.ecommerce.pages.UserProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F5_UserProfile_stepdefs {
	
	@Given("User Should be navigate to user home page")
	public void user_should_be_navigate_to_user_home_page() {
		UserHomePage.homeButton(Hook.driver).click();
	}

	@Given("accounts and lists button should be displayed")
	public void accounts_and_lists_button_should_be_displayed() {
		assertTrue(HomePage.accountSigninButton().isDisplayed());
	}

	@When("To enter into user profile place cursor on accounts drop down and wait till you see your accounts")
	public void to_enter_into_user_profile_place_cursor_on_accounts_drop_down_and_wait_till_you_see_your_accounts() {
		Hook.actions.moveToElement(HomePage.accountSigninButton()).perform();
	}

	@When("click on your accounts to go into user profile")
	public void click_on_your_accounts_to_go_into_user_profile() throws InterruptedException {
		HomePage.userAccount().click();
	}

	@When("User should land on the edit profile page")
	public void user_should_land_on_the_edit_profile_page() {
	    UserProfilePage.userAddressbutton(Hook.driver).click();
	}
		
	@Given("User should be able to click on new address button")
	public void user_should_be_able_to_click_on_new_address_button(){
		assertTrue(Hook.driver.getCurrentUrl().contains(DataFile.addressVerify));
	}

	@Then("User should be able to see the plus sign to add the new address")
	public void user_should_be_able_to_see_the_plus_sign_to_add_the_new_address() throws InterruptedException {
		assertTrue(UserAddressChangePage.addingNewAddressToTheUser(Hook.driver).isDisplayed());
	}
}
