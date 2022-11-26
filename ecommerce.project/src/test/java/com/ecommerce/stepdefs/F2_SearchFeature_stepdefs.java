package com.ecommerce.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.ItemSpecificationPage;
import com.ecommerce.pages.UserHomePage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F2_SearchFeature_stepdefs {
	
	@Given("User should be able to see the search bar in the home page")
	public void user_should_be_able_to_see_the_search_bar_in_the_home_page() {
		assertTrue(UserHomePage.searchBar(Hook.driver).isDisplayed());
	}

	@When("User should click the search to enter the item")
	public void user_should_click_the_search_to_enter_the_item() {
		UserHomePage.searchBar(Hook.driver).sendKeys(DataFile.searchItem + Keys.ENTER);
	}

	@When("User can be able to scroll down little down to select an item")
	public void user_can_be_able_to_scroll_down_little_down_to_select_an_item() {
		((JavascriptExecutor) Hook.driver).executeScript("window.scrollBy(0,2500)");
	}

	@Then("User should select an item from the filtered list")
	public void user_should_select_an_item_from_the_filtered_list() {
		UserHomePage.selectItem(Hook.driver).click();
	}
	
	@Then("User should see the selected item is opened")
	public void user_should_see_the_selected_item_is_opened() {
		assertEquals(DataFile.selectedItem, ItemSpecificationPage.productTitle(Hook.driver).getText());
	}
}
