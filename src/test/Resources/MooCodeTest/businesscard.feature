Feature: User should able to navigate to Business Card page


  @businesscard
  Scenario: Navigate to business card page

    Given User is on Moo home page
    When User clicks on Business Cards
    Then User should able to successfully navigate to Business Cards page