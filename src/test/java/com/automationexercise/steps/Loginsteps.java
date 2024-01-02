package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.propertyreader.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Loginsteps {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        Assert.assertEquals(new HomePage().getCurrentURL(), "https://automationexercise.com/");
    }

    @When("I scroll down to the footer")
    public void iScrollDownToTheFooter(String option) {
        new HomePage().clickOnHeaderTab(option);

    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String text) {
        Assert.assertEquals(new LoginPage().getTextFromLoginPage(text), text);
    }

    @When("I enter my email address in the input field")
    public void iEnterMyEmailAddressInTheInputField(String email, String password) {
        new LoginPage().sendDataToLoginFields(email, password);
    }

    @And("I click the arrow button")
    public void iClickTheArrowButton(String button) {
        new LoginPage().clickOnLoginPageButton(button);
    }

    @Then("I should see a success message {string}")
    public void iShouldSeeASuccessMessage(String text) {
        Assert.assertEquals(new HomePage().getLoggedInAsUserNameText(), text + PropertyReader.getInstance().getProperty("userName"));
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage(String text) {
        Assert.assertEquals(new LoginPage().getTextFromLoginPage(text), text);

    }

    @And("the text {string} is visible")
    public void theTextIsVisible(String arg0) {
    }

    @When("I enter the correct email address and password")
    public void iEnterTheCorrectEmailAddressAndPassword(String email, String password) {
        new LoginPage().sendDataToLoginFields(email, password);
    }

    @And("I click the {string} button")
    public void iClickTheButton(String button) {
        new LoginPage().clickOnLoginPageButton(button);
    }

    @Then("the text {string} should be visible")
    public void theTextShouldBeVisible(String text) {
        Assert.assertEquals(new HomePage().getLoggedInAsUserNameText(), text + PropertyReader.getInstance().getProperty("userName"));
    }

    @When("I enter an incorrect email address and password")
    public void iEnterAnIncorrectEmailAddressAndPassword() {
    }

    @Then("the error message {string} should be visible")
    public void theErrorMessageShouldBeVisible(String arg0) {
    }

    @Given("I am logged in as {string}")
    public void iAmLoggedInAs(String arg0) {
    }

    @Then("I should be navigated to the login page")
    public void iShouldBeNavigatedToTheLoginPage() {
    }

    @When("I click on the {string} button for any product")
    public void iClickOnTheButtonForAnyProduct(String arg0) {
    }

    @Then("The product detail page should open")
    public void theProductDetailPageShouldOpen() {
    }

    @And("I increase the quantity to {int}")
    public void iIncreaseTheQuantityTo(int arg0) {
    }

    @Then("The product should be displayed in the cart page with a quantity of {int}")
    public void theProductShouldBeDisplayedInTheCartPageWithAQuantityOf(int arg0) {
    }

    @And("the user fills in all signup details and creates an account")
    public void theUserFillsInAllSignupDetailsAndCreatesAnAccount() {
    }

    @Then("the user should see the {string} message")
    public void theUserShouldSeeTheMessage(String arg0) {
    }

    @And("the user should be able to click the {string} button")
    public void theUserShouldBeAbleToClickTheButton(String arg0) {
    }

    @And("the user should see {string} at the top")
    public void theUserShouldSeeAtTheTop(String arg0) {
    }

    @When("the user adds products to the cart")
    public void theUserAddsProductsToTheCart() {
    }

    @When("the user clicks {string}")
    public void theUserClicks(String arg0) {
    }

    @Then("the user should see their address details and order review")
    public void theUserShouldSeeTheirAddressDetailsAndOrderReview() {
    }

    @When("the user enters a description in the comment text area")
    public void theUserEntersADescriptionInTheCommentTextArea() {
    }

    @And("the user enters their payment details")
    public void theUserEntersTheirPaymentDetails() {
    }

    @Then("the user should see the success message {string}")
    public void theUserShouldSeeTheSuccessMessage(String arg0) {
    }

    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
    }

    @And("clicks the {string} button")
    public void clicksTheButton(String arg0) {
    }

    @And("clicks {string}")
    public void clicks(String arg0) {
    }

    @And("fills in all signup details and creates an account")
    public void fillsInAllSignupDetailsAndCreatesAnAccount() {
    }

    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String arg0) {
    }

    @Then("{string} should be displayed at the top")
    public void shouldBeDisplayedAtTheTop(String arg0) {
    }

    @Then("the address details should be correct")
    public void theAddressDetailsShouldBeCorrect() {
    }

    @And("the order summary should be displayed")
    public void theOrderSummaryShouldBeDisplayed() {
    }

    @And("enters payment details")
    public void entersPaymentDetails() {
    }

    @Then("the success message {string} should be displayed")
    public void theSuccessMessageShouldBeDisplayed(String arg0) {
    }

    @Then("the user should be redirected to the home page or a relevant landing page")
    public void theUserShouldBeRedirectedToTheHomePageOrARelevantLandingPage() {
    }

    @And("the user enters their email and password")
    public void theUserEntersTheirEmailAndPassword() {
    }

    @Then("the user should see {string} and {string} sections")
    public void theUserShouldSeeAndSections(String arg0, String arg1) {
    }

    @And("the user enters payment details")
    public void theUserEntersPaymentDetails() {
    }

    @And("the user clicks {string} button")
    public void theUserClicksButton(String arg0) {
    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String arg0) {
    }

    @Then("the user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @When("the homepage loads")
    public void theHomepageLoads() {
    }

    @Then("I should see the homepage content displayed successfully")
    public void iShouldSeeTheHomepageContentDisplayedSuccessfully() {
    }
}
