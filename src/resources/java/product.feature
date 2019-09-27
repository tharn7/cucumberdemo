Feature:Product search
  Scenario: Correct product name
    Given The user searches the product
    When the user enters the product name"Head"
    And The user is navigated to the product page
    And The product is added to cart
    And The user is navigated to the payment page
    Then The product is purchased
    
    Scenario: Wrong product name
    Given The user searches the product name
    When user enters the product name"hegh"
    Then user is shown the "Sorry no products available in this category. Please try some other"

