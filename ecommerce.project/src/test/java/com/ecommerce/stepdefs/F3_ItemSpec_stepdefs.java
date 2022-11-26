package com.ecommerce.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.ItemSpecificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;

public class F3_ItemSpec_stepdefs {
	
	@Given("User should be able to magnify the selectem item by hovering the image")
	public void user_should_be_able_to_magnify_the_selectem_item_by_hovering_the_image() {
		WebElement image = ItemSpecificationPage.imageWrapper(Hook.driver);
	    Hook.actions.moveToElement(image);
	}

	@When("User can be able to select all the images of the items one after another")
	public void user_can_be_able_to_select_all_the_images_of_the_items_one_after_another() throws InterruptedException {
		List<WebElement> items = ItemSpecificationPage.hoverTheMouseOnTheItems(Hook.driver);
		for(WebElement item: items) {
			Thread.sleep(1000);
			Hook.actions.moveToElement(item).perform();
		}
	}

	@When("Verify the Item is in stock")
	public void verify_the_item_is_in_stock() {
		String stock = ItemSpecificationPage.inStock(Hook.driver).getText();
	    assertEquals(DataFile.inStock, stock);
	}
}
