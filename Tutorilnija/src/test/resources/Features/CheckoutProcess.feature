Feature: Checkout process on TutorialsNinja Demo Website

  Scenario: Add items to the cart and complete checkout
    Given the user is on the product page
    When the user adds "MacBook" to the cart
    And the user proceeds to checkout
    Then the user should see the order summary with the correct product details

  Scenario: Apply a promo code and verify discount calculation
    Given the user has added items to the cart
    When the user applies the promo code "DISCOUNT10"
    Then the discount should be applied correctly
