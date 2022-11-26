package com.ecommerce.stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Features - where is your features files
//Glue - where is your step definition files
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
				tags= "@LoginToAmazonWebsite or @SearchBarTest or @ItemSpecification or @Itemsadditionandcount or "
						+ "@Useraccounttest or @UseraddressChange or @Addnewaddress or @Logout" ,
				glue = "com.ecommerce.stepdefs", 
				publish = true,
				plugin = { 
						"pretty",
						"json:Reports/cucumber.json", 
						"junit:Reports/cucumber.junit", 
						"html:Reports/cucumber.html"},
				monochrome =  true,
				dryRun = false
				
)
public class Test_Runner {}