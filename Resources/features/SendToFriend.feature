Feature: I want to send a link to the product to my friend

  Scenario: Send a link to the product to a friend 1
    Given I open ProductPage
    When I press SendToAFriend link
    And I fill in my friend Name
    And I fill in my friend EmailAddress
    And I press SendToFriend button
    Then I see SuccessfulSendLinkMessage

    Scenario: Send a link to the product to a friend 2
      Given I open ProductPage
      When I press SendToAFriend link
      And I fill in my friend Name
      And I enter blank my friend EmailAddress
      And I press SendToFriend button
      Then I see error SendLinkFail

