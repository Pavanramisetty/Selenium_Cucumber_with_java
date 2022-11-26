package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	    @FindBy(name="email")
	    static WebElement usernameOrEmailField;
	    
	    @FindBy(xpath="/html/head/title")
	    static WebElement loginPageTitle;
	    
	    @FindBy(id="continue")
	    static WebElement continueButton;
	    
	    @FindBy(name="password")
	    static WebElement passwordField;
	    
	    @FindBy(name="rememberMe")
	    static WebElement rememberMeCheckBox;
	    
	    @FindBy(id="signInSubmit")
	    static WebElement submitButton;
	    
	    public static WebElement usernameOrEmailField() {
			return usernameOrEmailField;
		}
	    
	    public static WebElement loginPageTitle() {
	    	return loginPageTitle;
	    }
		
		public static WebElement continueButton() {
			return continueButton;
		}
		
		public static WebElement passwordField() {
			return passwordField;
		}
		
		public static WebElement rememberMeCheckBox() {
			return rememberMeCheckBox;
		}
		
		public static WebElement submitButton() {
			return submitButton;
		}
}
