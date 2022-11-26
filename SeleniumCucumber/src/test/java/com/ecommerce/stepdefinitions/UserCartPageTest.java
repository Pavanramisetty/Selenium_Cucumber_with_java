package com.ecommerce.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.ItemSpecificationPage;
import com.ecommerce.pages.UserCartPage;


public class UserCartPageTest {

	@Test
	public void addItemToTheCart() {
		ItemSpecificationPage.addToCart(TestSuite.driver).click();
		//assertEquals(DataFile.selectedItem, UserCartPage.cartItem(TestSuite.driver).getText());
	}
	
	@Test
	public void itemsCountInCart() {
		UserCartPage.cartButton(TestSuite.driver).click();
		assertEquals(DataFile.initialItems, UserCartPage.cartCount(TestSuite.driver).getText());
	}
	
	@Test
	public void quantityChange() {
		UserCartPage.quantity(TestSuite.driver).sendKeys("3");
		assertEquals(DataFile.changeItems, UserCartPage.cartCount(TestSuite.driver).getText());
	}
	
	@Test
	public void deleteItemsInCart() {
		UserCartPage.deleteItemsInCart(TestSuite.driver).click();
		assertEquals(DataFile.cartIsZero, UserCartPage.emptyCart(TestSuite.driver).getText());
	}
}
