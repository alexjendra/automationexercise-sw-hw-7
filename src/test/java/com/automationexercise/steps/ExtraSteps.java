package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ExtraSteps {

    @Then("I should see the {string} heading")
    public void iShouldSeeTheHeading(String arg0) {
    }

    @And("I should see the contact form with fields for name, email, subject, message, and file upload")
    public void iShouldSeeTheContactFormWithFieldsForNameEmailSubjectMessageAndFileUpload() {
    }

    @When("I enter my name, email, subject, and message")
    public void iEnterMyNameEmailSubjectAndMessage() {
    }

    @And("I upload a file")
    public void iUploadAFile() {
        new ContactUsPage().uploadFile();
    }

    @And("I click the {string} button on any confirmation dialog")
    public void iClickTheButtonOnAnyConfirmationDialog(String arg0) {
        new ContactUsPage().clickOnSubmitButton();
    }

    @Then("I should be redirected to the homepage")
    public void iShouldBeRedirectedToTheHomepage() {
    }

    @And("I should see the homepage content")
    public void iShouldSeeTheHomepageContent() {
        new ContactUsPage().clickOnHomeButton();
    }
    @Then("I should see the success message {string}")
    public void iShouldSeeTheSuccessMessage(String expectedText) {
        Assert.assertEquals(new ContactUsPage().getDetailsSubmittedMessage(),expectedText);
    }

    @Then("I am on text cases page and verify the test-cases URL {string}")
    public void iAmOnTextCasesPageAndVerifyTheTestCasesURL(String expectedURL) {
        Assert.assertEquals(new TestCasesPage().getCurrentURL(), expectedURL);
    }

    @When("I scroll down up to subscription link")
    public void iScrollDownUpToSubscriptionLink() {
        new HomePage().scrollDownToSubscriptionLink();
    }

    @Then("I enter email {string}")
    public void iEnterEmail(String email) {
        new HomePage().sendDataToSubscriptionEmail(email);
    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
        new HomePage().clickOnArrowToSubscribe();
    }

    @And("I should see the success subscription message {string}")
    public void iShouldSeeTheSuccessSubscriptionMessage(String expectedMessage) {
        Assert.assertEquals(new HomePage().getSubscriptionSuccessMessage(), expectedMessage);
    }

    @Then("I should see the subscription {string} text")
    public void iShouldSeeTheSubscriptionText(String expectedText) {
        Assert.assertEquals(new HomePage().getSubscriptionText(), expectedText);
    }

    @And("I click on arrow up button at bottom right corner")
    public void iClickOnArrowUpButtonAtBottomRightCorner() {
        new HomePage().clickOnBottomRightArrowButton();
    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getFullFledgedText(), expectedText);
    }

    @And("I scroll up")
    public void iScrollUp() {
        new HomePage().scrollUp();
    }

    @Then("I click on cross button to remove the product from the cart")
    public void iClickOnCrossButtonToRemoveTheProductFromTheCart() {
        new ShoppingCartPage().clickOnCrossButtonAcrossProductToRemove();
    }

    @And("I click on register link in the checkout popup")
    public void iClickOnRegisterLinkInTheCheckoutPopup() {
        new ShoppingCartPage().clickOnRegisterLoginLinkOnCheckoutPopup();
    }

    @And("I click on download invoice after order success")
    public void iClickOnDownloadInvoiceAfterOrderSuccess() {
        new PaymentPage().clickOnDownloadInvoiceButtonAfterOrderSuccessMessage();
    }

    @And("I click on continue button after order success")
    public void iClickOnContinueButtonAfterOrderSuccess() {
        new PaymentPage().clickOnContinueButtonAfterOrderSuccessMessage();
    }

    @Given("I am on the homepage of the website")
    public void iAmOnTheHomepageOfTheWebsite() {
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String arg0) {
    }

    @Given("the user is on the current page")
    public void theUserIsOnTheCurrentPage() {
    }

    @Then("the user should be navigated to the Test Cases page")
    public void theUserShouldBeNavigatedToTheTestCasesPage() {
    }
}
