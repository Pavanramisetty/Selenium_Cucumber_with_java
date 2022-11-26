#Author: Pavan Ramisetty
#Keywords Summary : Cart page feature test additems, count, quantity and deleteitems test 
#Feature: additems and deleteitems
#Sample Feature Definition Template
@UserCartPageFeature
Feature: Test the user cart items addition count and deletion

  @Itemsadditionandcount
  Scenario: User Should be on the user cart page
    Given User should see the addItem to cart button
    And User should be able to click the add to cart button
    When Item is added to cart and available in cart
    And Change the item quantity of the item

