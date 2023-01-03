Feature: Checking Login functionality

  Background: 
    Given user navigate to the Application
    And user navigated to login page
    When user enter username and password
    And user should be logged in
    Then user should see "Welcome, satya prasad!"

  @Login
  Scenario: Verify login using valid credentials
    And user navigated to login page
    When user enter username and password
    And user should be logged in
    Then user should see "Welcome, satya prasad!"

  @Login
  Scenario: Verify login using invalid credentials
    When user enter invalid username and password
    And user should be logged in
    Then user should see error message "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."