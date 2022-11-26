#Author: Pavan Ramisetty
#Keywords Summary : Profle modification feature test
#Feature: NAvigate to User profile.
#Sample Feature Definition Template
@UserProfileFeature
Feature: User profile and user account edit feature
  
  @Useraccounttest
  Scenario: Navigate to home page and navigate to user account from the profile
    Given User Should be navigate to user home page
    And accounts and lists button should be displayed
    When To enter into user profile place cursor on accounts drop down and wait till you see your accounts
    And click on your accounts to go into user profile
    And User should land on the edit profile page
    Given User should be able to click on new address button
    Then User should be able to see the plus sign to add the new address
