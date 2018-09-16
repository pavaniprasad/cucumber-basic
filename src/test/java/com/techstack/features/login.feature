@tag
Feature: Login Feature
  This feature deals with login functionality in the application

  @tag1
  Scenario: Login with correct username and password
    Given I navigate to login page
    And I enter following details
      | userName | password |
      | admin    | admin    |
    And I click login button
    Then I should see login form

  @tag2
  Scenario: Login with correct username and password
    Given I navigate to login page
    And I enter following details
      | userName | password |
      | test1    | test1    |
    And I click login button
    Then I should see login form

  @tag3
  Scenario: rest API testing
    Given the API is up and running with following URL "http://localhost:9999"
