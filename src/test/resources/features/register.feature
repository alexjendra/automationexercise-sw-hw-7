@author_khushbu_raval
  @Regression
Feature: User Account Creation and Deletion

  Scenario: Successful account creation and deletion

    Given the user is on the home page of the website
    When the user clicks on the "Signup / Login" button
    And the user enters their name and email address in the signup form
    And the user clicks on the "Signup" button
    Then the "ENTER ACCOUNT INFORMATION" section should be displayed
    When the user enters their account details:
      | Field        | Value       |
      |---------------|--------------|
      | Title        | Mr.    |
      | Name         | [Aarav Sheth] |
      | Email        | [aarav2511@gmail.com] |
      | Password     | [aaru@2511] |
      | Date of birth | 2015-11-25   |
    And the user selects the "Sign up for our newsletter!" checkbox
    And the user selects the "Receive special offers from our partners!" checkbox
    And the user enters their personal details:
      | Field       | Value       |
      |--------------|--------------|
      | First name  | [Aarav] |
      | Last name   | [Sheth] |
      | Company     | [AT Corporation]    |
      | Address     | [Flat 5]    |
      | Address2    | [Abhilasha Flat]   |
      | Country     | [India]    |
      | State       | [Gujarat]      |
      | City        | [Ahmedabad]       |
      | Zipcode     | [380013]    |
      | Mobile Number| [9574864803] |
    And the user clicks on the "Create Account" button
    Then the "ACCOUNT CREATED!" message should be displayed
    When the user clicks on the "Continue" button
    Then the user should be logged in and the message "Logged in as [username]" should be displayed
    When the user clicks on the "Delete Account" button
    And the user confirms the deletion
    Then the "ACCOUNT DELETED!" message should be displayed
    And the user should be redirected to the home page

  Scenario: User attempts to signup with an already registered email address

    Given the user is on the signup page
    When the user enters the following information:Name: <name>Email address: <already registered email address> And the user clicks the "Signup" button Then the following error message should be displayed: "Email Address already exist!"