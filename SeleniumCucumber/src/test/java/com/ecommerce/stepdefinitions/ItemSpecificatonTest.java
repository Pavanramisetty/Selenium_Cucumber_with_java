package com.ecommerce.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.ItemSpecificationPage;

public class ItemSpecificatonTest {
	
	@Test
	public void slidetheMouseToTheImage() {
		WebElement image = ItemSpecificationPage.imageWrapper(TestSuite.driver);
		TestSuite.actions.moveToElement(image);
	}
	
	@Test
	public void projectAllPhotosOfTheItem() throws InterruptedException {
		List<WebElement> items = ItemSpecificationPage.hoverTheMouseOnTheItems(TestSuite.driver);
		for(WebElement item: items) {
			Thread.sleep(2000);
			TestSuite.actions.moveToElement(item).perform();
		}
	}
	
	@Test
	public void inStockVerification() {
		String stock = ItemSpecificationPage.inStock(TestSuite.driver).getText();
	    assertEquals(DataFile.inStock, stock);
	}
}
