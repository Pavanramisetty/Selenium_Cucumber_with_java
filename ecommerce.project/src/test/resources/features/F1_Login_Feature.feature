#Author: Pavan Ramisetty
#Feature: Login to Ecommerce Site
#Sample Feature Definition Template
@AccountLoginFeature
Feature: Ecommerce website amazon login feature
  I want to use this template for my feature file

  @LoginToAmazonWebsite
  Scenario: User Should login with the credentials
    Given User launches the amazon site home page
    And Account signbuton should be displayed
    When User click on account signin button
    And User should navigate to username page
    And User should see the "<username>" field
    And User should see the continue button
    When User click on continue button
    And User should see the password field
    And User should see the Keep me sign in checkbox
    And User should click Signin buton
    Then User should Land on Ecomerce amazon User Home page
    
    Examples: 
      | username                    |
      | pavan.ramisetty91@gmail.com |
      
    
