Feature: Test the end to end functionality of an particulur Women product

  Background: 
    Given user navigate to the Application
    And user navigated to login page
    When user enter username and password
    And user should be logged in
    Then user should see "Welcome, satya prasad!"

  @Women
  Scenario: 
    Given user click on "Women" Drop down
    And user verify "Women" breadcrum
    And user click on "Hoodies & Sweatshirts"
    Then user should see the text of "Hoodies & Sweatshirts"
    And user select any of the product
    Then user should see ItemName "Item Name"
    And user should see ItemPrice "ItemPrice"
    And user enter QTY in Quantity field
    And user get the product details
    And user select product size
    And user select product colour
    And user click on added to cart button
    Then user verify cart message
    And user navigate to mycart
    And user click on checkout button
    And user enter street address
    And user enter City Name
    And user select country name
    And user select state
    And user enter zip code
    And user enter phone number
    #And user select shipping method
    And user click on next button
    And user click on place order button
    And user should verify "Thank you for your purchase!"
    And user print order details
    Then user click on continue shopping button
