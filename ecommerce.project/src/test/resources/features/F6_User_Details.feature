#Author: User Address change Feature
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@UserAddingNewAddressFeature
Feature: Adding the new address for the existing user

  @Addnewaddress
  Scenario: Add the full name of the new address
    Given User should be on the user profile page
    And Click on the new addess button to add new address
    When Full name address feild should be availble.
    And Ener the full "<name>" for the new address
    And Scrol down till the submit is visible
    Then click on add new address

    Examples: 
      | name     |
      | new name |
