package com.ecommerce.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.ItemSpecificationPage;
import com.ecommerce.pages.UserHomePage;

public class SearchFeatureTest {
	
	@Test
	public void searchBarTest() {
		UserHomePage.searchBar(TestSuite.driver).sendKeys(DataFile.searchItem + Keys.ENTER);
		assertTrue(TestSuite.driver.getCurrentUrl().contains(DataFile.searchItem));
	}
	
	@Test
	public void selectItemfromThesearchedList() {
		 ((JavascriptExecutor) TestSuite.driver).executeScript("window.scrollBy(0,2500)");
         UserHomePage.selectItem(TestSuite.driver).click();
         assertEquals(DataFile.selectedItem, ItemSpecificationPage.productTitle(TestSuite.driver).getText());
	}

}
