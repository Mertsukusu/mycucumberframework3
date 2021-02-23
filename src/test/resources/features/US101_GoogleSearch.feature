@hooks
Feature: US1000 Google search test

  Background: User is on the google page
    Given user is on the google page

  Scenario: TC01 Verify testing tools search
    And user search for "testing tools"
    Then verify the result has "testing tools"