@Regression
Feature: Account Management

  Scenario: User successfully subscribes field

    Given I am on the home page
    When I scroll down to the footer
    Then I should see the text "SUBSCRIPTION"
    When I enter my email address in the input field
    And I click the arrow button
    Then I should see a success message "You have been successfully subscribed!"

    @Regression
  Scenario: Successful login and account deletion

    Given I am on the login page
    And the text "Login to your account" is visible
    When I enter the correct email address and password
    And I click the "login" button
    Then the text "Logged in as username" should be visible
    When I click the "Delete Account" button
    Then the text "ACCOUNT DELETED!" should be visible

  Scenario: Unsuccessful login
    Given I am on the login page
    When I enter an incorrect email address and password
    And I click the "login" button
    Then the error message "Your email or password is incorrect!" should be visible
  Scenario: Successful login and logout

    Given I am logged in as "username"
    And the text "Logged in as username" is visible
    When I click the "Logout" button
    Then I should be navigated to the login page

  Scenario: User adds a product to cart with a specific quantity

    Given I am on the home page
    When I click on the "View Product" button for any product
    Then The product detail page should open
    And I increase the quantity to 4
    When I click the "Add to cart" button
    And I click the "View Cart" button
    Then The product should be displayed in the cart page with a quantity of 4

