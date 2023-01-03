Feature: user new account registration with LUMA Application

  @Registration
  Scenario: creating new account for user
    Given user navigate to application url
    When user click on Create an Account link
    And user navigated to registration page
    And user enter first name
    And user enter last name
    And user enter email
    And user enter password
    And user enter confirm password
    And user click on create an account button
    Then user should see "Thank you for registering" or "There is already" message
