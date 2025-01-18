Feature: Product search and filters on TutorialsNinja Demo Website

  Scenario: Search for a product and apply filters
    Given the user is on the homepage
    When the user searches for "Laptop"
    And the user applies filters for category "Laptops & Notebooks", price range "500-1000", and rating "4 stars and above"
    Then the user should see filtered results matching the criteria

  Scenario: Validate sorting functionality
    Given the user has searched for "Laptop"
    When the user sorts results by "Price (Low > High)"
    Then the products should be sorted by price in ascending order
