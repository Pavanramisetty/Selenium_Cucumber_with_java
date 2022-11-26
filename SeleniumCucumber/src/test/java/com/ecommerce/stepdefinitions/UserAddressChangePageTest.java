package com.ecommerce.stepdefinitions;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.openqa.selenium.JavascriptExecutor;

import com.ecommerce.data.DataFile;
import com.ecommerce.pages.UserAddressChangePage;

public class UserAddressChangePageTest {
	
	@Test
	public void addingNewAddress() throws InterruptedException {
		UserAddressChangePage.addingNewAddressToTheUser(TestSuite.driver).click();;
		Thread.sleep(10000);
	}
	
	@Test
	public void fullNameAddition() throws InterruptedException {
		UserAddressChangePage.fullName(TestSuite.driver).sendKeys(DataFile.fullname);
		Thread.sleep(10000);
		((JavascriptExecutor) TestSuite.driver).executeScript("window.scrollBy(0,500)");
		UserAddressChangePage.submit(TestSuite.driver).click();
		Thread.sleep(10000);
	}

	
}
