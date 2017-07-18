@search
Feature: User should able to use search functionality  so that he can search any product from our website

  Scenario Outline: Search result for valid product should return with valid product list

    Given User is on Moo home page
    When User search for valid product as "<product>"on search box
    Then User should able to view all related products as "<product>" in a search result successfully
    Examples:
      | product       |
      | Business Card |
      | Postcard      |
      | MiniCard      |

  Scenario Outline: Search result for invalid product should return with message and empty product list

    Given User is on Moo home page
    When User search for invalid product as "<Invalid product>"on search box
    Then User should see meaningful message with no product displayed
    Examples:
      | Invalid product |
      | Krishna         |
      | shdhguwuh       |
      | 1234567890!£$   |