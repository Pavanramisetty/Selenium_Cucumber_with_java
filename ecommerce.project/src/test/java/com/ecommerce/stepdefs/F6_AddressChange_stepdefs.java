package com.ecommerce.stepdefs;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.UserAddressChangePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F6_AddressChange_stepdefs {
	
	@Given("User should be on the user profile page")
	public void user_should_be_on_the_user_profile_page() {
		assertTrue(UserAddressChangePage.addingNewAddressToTheUser(Hook.driver).isDisplayed());
	}

	@Given("Click on the new addess button to add new address")
	public void click_on_the_new_addess_button_to_add_new_address() {
		UserAddressChangePage.addingNewAddressToTheUser(Hook.driver).click();
	}

	@When("Full name address feild should be availble.")
	public void full_name_address_feild_should_be_availble() {
		assertTrue(UserAddressChangePage.fullName(Hook.driver).isDisplayed());
	}

	@When("Ener the full {string} for the new address")
	public void ener_the_full_for_the_new_address(String username) {
		UserAddressChangePage.fullName(Hook.driver).sendKeys(DataFile.fullname);
	}

	@When("Scrol down till the submit is visible")
	public void scrol_down_till_the_submit_is_visible() {
		((JavascriptExecutor) Hook.driver).executeScript("window.scrollBy(0,500)");
	}

	@Then("click on add new address")
	public void click_on_add_new_address() {
		UserAddressChangePage.submit(Hook.driver).click();
	}

}
