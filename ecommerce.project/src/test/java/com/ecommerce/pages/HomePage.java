package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	    @FindBy(id="nav-link-accountList-nav-line-1")
	    static WebElement accountSigninButton;
	    
	    @FindBy(id="nav-item-signout")
	    static WebElement signOut;
	    
	    @FindBy(xpath="//*[@id='nav-al-your-account']/a[1]")
	    static WebElement userAccount;
	    
		public static WebElement accountSigninButton() {
		    return accountSigninButton;
		}
		
		public static WebElement signOut() {
			return signOut;
		}
		
		public static WebElement userAccount() {
			return userAccount;
		}
}
