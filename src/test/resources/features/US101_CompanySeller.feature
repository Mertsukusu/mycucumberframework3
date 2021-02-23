@hooks
Feature: US101 The system should allow Company Seller registration with valid credentials
  Background: User is on the Global Trader page
    Given user is on the Global Trader page
    And user is on click Seller Join Now

  Scenario: TC01 The system should allow Company Seller registration

    When  user enters company name
    And user enters company Mobile
    And user enter company address
    When  user enters the fullname
    And  user enters the email
    And user enter Sub Domain
    And user enter Mobile Number
    When user select to country
    And user enter to state
    And user enter to city
    And user enter to postal code
    When user enter address
    When Select to categories
    And Enter to password
    And Click to Registration Button
    Then Verify to registration data
