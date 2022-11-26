#Author: Pavan Ramisetty
#Keywords Summary : This feature is going to search the item in the ecommerce website
#Feature: List of scenarios.
#Scenario: Search an Item frm the user Home page
#Sample Feature Definition Template
@SearchFeature
Feature: Search bar feature test in Amazon website

  @SearchBarTest
  Scenario: User should be able to search an Item in user Home page
    Given User should be able to see the search bar in the home page
    When User should click the search to enter the item
    And User can be able to scroll down little down to select an item
    Then User should select an item from the filtered list
    And User should see the selected item is opened
