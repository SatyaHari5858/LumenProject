Feature: Checking Login functionality
	
	@Login
  Scenario: User is Logged In
    Given user navigate to the Application
    And user navigated to login page
    When user enter username and password
    And user should be logged in
    Then user should see "Welcome, satya prasad!"
