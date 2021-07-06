@search
Feature: Searching feature

#1. Search for a “Dell Laptop”

  @subtitle @amazon
  Scenario: searched product is seen in the subtitle
    Given the user is in the main page
    When the user searches for "Dell Laptop"
    Then the user should see the "Dell Laptop" in the title
    And the user should see "Dell Laptop" in the subtitle

  @searchButton @amazon
  Scenario: search button is enabled
    Given the user is in the main page
    When the user searches for "Dell Laptop"
    Then the search input box should be interactable

  @negativePath @amazon
  Scenario Outline: only authorized user can proceed to checkout
    Given the user is in the main page
    When the user searches for "<itemName>"
    And the user selects the result containing "<itemSubtitle>"
    And the user adds the selected product to the basket
    And the user clicks Proceed to Checkout
    Then the user should see the "<pageTitle>" in the title
    Examples:
      | itemName    | itemSubtitle                          | pageTitle      |
      | Monitor     | Acer R240HY bidx 23.8-Inch            | Amazon Sign-In |
      | Dell Laptop | 2021 Newest Dell Inspiron 3000 Laptop | Amazon Sign-In |




