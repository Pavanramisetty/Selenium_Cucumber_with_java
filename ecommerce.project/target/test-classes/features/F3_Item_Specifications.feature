#Author: Pavan Ramisetty
#Keywords Summary :
#Feature: Item specification feature
#Scenario: Checking the item hovering and selecting the item images
## (Comments)
#Sample Feature Definition Template
@ItemSpecificationFeature
Feature: Item specification test hovering and selecting the item images

  @ItemSpecification
  Scenario: User should be on the Item page
    Given User should be able to magnify the selectem item by hovering the image
    When User can be able to select all the images of the items one after another
    And Verify the Item is in stock