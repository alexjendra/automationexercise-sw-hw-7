package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    @CacheLookup
    @FindBy(css = "a[href='/login']")
    WebElement signupLoginButton;


    @CacheLookup
    @FindBy(name = "email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    WebElement signUpButton;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(name = "title")
    WebElement radioButtonMr;

    @CacheLookup
    @FindBy(id = "id_gender2")
    WebElement radioButtonMrs;

    @CacheLookup
    @FindBy(className = "title text-center")
    WebElement accountInformationText;


    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address1;

    @CacheLookup
    @FindBy(name = "address2")
    WebElement address2;

    @CacheLookup
    @FindBy(name = "country")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "state")
    WebElement stateField;

    @CacheLookup
    @FindBy(id = "city")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement zipcodeField;

    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobileNumberField;

    @CacheLookup
    @FindBy(xpath = "(//button[@type = 'submit'])[1]")
    WebElement createAccount;

    @CacheLookup
    @FindBy(id = "days")
    WebElement dateOfBirthdayDropdown;
    @CacheLookup
    @FindBy(name = "months")
    WebElement monthOfBirthdayDropdown;
    @CacheLookup
    @FindBy(id = "years")
    WebElement yearOfBirthdayDropdown;

    @CacheLookup
    @FindBy(id = "newsletter")
    WebElement newsLettersCheckBox;
    @CacheLookup
    @FindBy (xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedMessage;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterAccountCreated;

    @CacheLookup
    @FindBy (xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccountInformationText;

    @CacheLookup
    @FindBy (xpath = "//input[@id='optin']")
    WebElement specialOfferCheckBox;




    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter Email : " + emailField.toString());
    }

    public void signUp(){
        clickOnElement(signUpButton);
    }
    public String getAccountInformationText(){
        String message = getTextFromElement(accountInformationText);
        log.info("Getting text from : " + accountInformationText.toString());
        return message;
    }


    public void sendDataToSignUpForm(String title, String password,String date, String month, String year, String fName,
                                     String lName, String add1, String add2, String country, String state, String city,
                                     String zipcode, String mNumber) {
        if (title.equalsIgnoreCase("Mr")){
            clickOnElement(radioButtonMr);
            log.info("Selecting radio button against Mr.");
        } else {
            clickOnElement(radioButtonMrs);
            log.info("Selecting radio button against Mrs.");
        }
        sendTextToElement(passwordField, password);
        log.info("Sending " + password + " to password field");
        selectByVisibleTextFromDropDown(dateOfBirthdayDropdown, date);
        log.info("Selecting " + date + " from Day dropdown in DOB");
        selectByVisibleTextFromDropDown(monthOfBirthdayDropdown, month);
        log.info("Selecting " + month + " from Month dropdown in DOB");
        selectByVisibleTextFromDropDown(yearOfBirthdayDropdown, year);
        log.info("Selecting " + year + " from Year dropdown in DOB");
        sendTextToElement(firstNameField, fName);
        log.info("Sending " + fName + " to First Name field");
        sendTextToElement(lastNameField, lName);
        log.info("Sending " + lName + " to Last Name field");
        sendTextToElement(address1, add1);
        log.info("Sending " + add1 + " to Address1 field");
        sendTextToElement(address2, add2);
        log.info("Sending " + add2 + " to Address2 field");
        selectByVisibleTextFromDropDown(countryField, country);
        log.info("Selecting " + country + " from Country dropdown");
        sendTextToElement(stateField, state);
        log.info("Sending " + state + " to State field");
        sendTextToElement(cityField, city);
        log.info("Sending " + city + " to City field");
        sendTextToElement(zipcodeField, zipcode);
        log.info("Sending " + zipcode + " to Zipcode field");
        sendTextToElement(mobileNumberField, mNumber);
        log.info("Sending " + mNumber + " to Mobile Number field");
    }
    public void selectCheckBoxLetter(){
        clickOnElement(newsLettersCheckBox);
        log.info("Clicking on News Letter Subscription Check Box : " + newsLettersCheckBox.toString());
    }
    public void clickCreateAccount(){
        // clickOnElement(createAccountButton);
        try {
            createAccount.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[@type = 'submit'])[1]")));
        }
        log.info("Clicking on create account button : " +createAccount.toString());
    }
    public String getAccountCreatedMessage(){
        log.info("Getting account created message  : " + accountCreatedMessage.toString());
        return getTextFromElement(accountCreatedMessage);
    }
    public void clickOnContinueButtonAfterAccountCreated() {
        clickOnElement(continueButtonAfterAccountCreated);
        log.info("Clicking on continue button after account created : " + continueButtonAfterAccountCreated.toString());
    }

    public String getEnterAccountInformation() {
        log.info("Getting Enter Account Information text : " + enterAccountInformationText.toString());
        return getTextFromElement(enterAccountInformationText);
    }
    public void clickOnReceiveSpecialOfferCheckBox() {
        clickOnElement(specialOfferCheckBox);
        log.info("Clicking on Receive Special Offer Check Box : " + specialOfferCheckBox.toString());
    }

}



