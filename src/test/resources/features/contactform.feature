@Regression
  @author_Khushbu_raval
Feature: Contact Us Form Functionality

  Scenario: User submits a contact form with file upload

    Given I am on the homepage of the website
    When I click on the "Contact Us" button
    Then I should see the "GET IN TOUCH" heading
    And I should see the contact form with fields for name, email, subject, message, and file upload

    When I enter my name, email, subject, and message
    And I upload a file
    And I click the "Submit" button
    And I click the "OK" button on any confirmation dialog
    Then I should see a success message "Success! Your details have been submitted successfully."

    When I click the "Home" button
    Then I should be redirected to the homepage
    And I should see the homepage content