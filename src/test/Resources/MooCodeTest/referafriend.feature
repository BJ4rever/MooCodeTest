Feature: User should able to refer a product to friend, so that he can share good MOO products with others

  @referfriend
  Scenario: Refer a product to friend by email

    Given User is on Moo home page
    When User navigate to Refer a Friend
    And User enters all required details
    Then User should able to successfully send a email to a friend

