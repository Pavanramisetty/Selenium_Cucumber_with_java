package com.ecommerce.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.ItemSpecificationPage;
import com.ecommerce.pages.UserCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F4_UserCart_stepdefs {
	
	@Given("User should see the addItem to cart button")
	public void user_should_see_the_add_item_to_cart_button() {
	    assertTrue(ItemSpecificationPage.addToCart(Hook.driver).isDisplayed());
	}

	@Given("User should be able to click the add to cart button")
	public void user_should_be_able_to_click_the_add_to_cart_button() {
		ItemSpecificationPage.addToCart(Hook.driver).click();
	}

	@When("Item is added to cart and available in cart")
	public void item_is_added_to_cart_and_available_in_cart() {
		UserCartPage.cartButton(Hook.driver).click();
		assertEquals(DataFile.initialItems, UserCartPage.cartCount(Hook.driver).getText());
	}

	@When("Change the item quantity of the item")
	public void change_the_item_quantity_of_the_item() throws InterruptedException {
		UserCartPage.quantity(Hook.driver).sendKeys(DataFile.changeItems);
		Thread.sleep(5);
	}

	@Then("Cart should be empty after deleting the item")
	public void cart_should_be_empty_after_deleting_the_item() {
		assertEquals(DataFile.cartIsZero, UserCartPage.emptyCart(Hook.driver).getText());
	}
}
