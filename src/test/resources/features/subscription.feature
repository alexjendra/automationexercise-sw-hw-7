@Regression
Feature: Homepage and Subscription Functionality

  Scenario: Verifying Home Page Visibility, Subscription Process, and Success Message

    Given I am on the homepage
    When the homepage loads
    Then I should see the homepage content displayed successfully

    When I click the "Cart" button
    And I scroll down to the footer
    Then I should see the text "SUBSCRIPTION"

    When I enter my email address in the input field
    And I click the arrow button
    Then I should see the success message "You have been successfully subscribed!"