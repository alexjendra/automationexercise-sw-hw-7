package com.automationexercise.steps;

import com.automationexercise.pages.PaymentPage;
import com.automationexercise.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Given("the user is on the home page of the website")
    public void theUserIsOnTheHomePageOfTheWebsite(String expectedText) {
        Assert.assertEquals(new SignUpPage().getEnterAccountInformation(),expectedText);
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton() {

    }

    @And("the user enters their name and email address in the signup form")
    public void theUserEntersTheirNameAndEmailAddressInTheSignupForm(String name ,String email) {


    }

    @Then("the {string} section should be displayed")
    public void theSectionShouldBeDisplayed() {

    }

    @When("the user enters their account details:")
    public void theUserEntersTheirAccountDetails(String password) {

    }

    @And("the user selects the {string} checkbox")
    public void theUserSelectsTheCheckbox() {

    }

    @And("the user enters their personal details:")
    public void theUserEntersTheirPersonalDetails() {
    }

    @Then("the {string} message should be displayed")
    public void theMessageShouldBeDisplayed(String arg0) {
    }

    @Then("the user should be logged in and the message {string} should be displayed")
    public void theUserShouldBeLoggedInAndTheMessageShouldBeDisplayed(String arg0) {
    }

    @And("the user confirms the deletion")
    public void theUserConfirmsTheDeletion() {
        new PaymentPage().clickOnPayAndConfirmOrderButton();
    }

    @And("the user should be redirected to the home page")
    public void theUserShouldBeRedirectedToTheHomePage() {
    }

    @Given("the user is on the signup page")
    public void theUserIsOnTheSignupPage() {
    }

    @When("the user enters the following information:Name: <name>Email address: <already registered email address> And the user clicks the {string} button Then the following error message should be displayed: {string}")
    public void theUserEntersTheFollowingInformationNameNameEmailAddressAlreadyRegisteredEmailAddressAndTheUserClicksTheButtonThenTheFollowingErrorMessageShouldBeDisplayed(String arg0, String arg1) {
    }
}
