package com.automationexercise.steps;

import com.automationexercise.pages.DetailsOfProductPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductPage;
import com.automationexercise.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSteps {
    @Given("I am on homepage and verify the homepage URL")
    public void iAmOnHomepageAndVerifyTheHomepageURL() {

    }

    @When("I click on products tab")
    public void iClickOnProductsTab() {
    }

    @Then("I should see text {string} on product page")
    public void iShouldSeeTextOnProductPage(String expectedText) {
        Assert.assertEquals(new ProductPage().getAllProductText(), expectedText);
    }

    @And("I click on view product of first product {string}")
    public void iClickOnViewProductOfFirstProduct(String pName) {
        new ProductPage().clickOnViewProductWithProductName(pName);
    }

    @And("I am on product details page and verify the URL")
    public void iAmOnProductDetailsPageAndVerifyTheURL() {
        Assert.assertTrue(new DetailsOfProductPage().verifyTheURL().contains("https://automationexercise.com/product_details"));
    }

    @And("I should see product name {string}")
    public void iShouldSeeProductName(String pName) {
        Assert.assertEquals(new DetailsOfProductPage().getProductName(), pName);
    }

    @And("I should see category {string}")
    public void iShouldSeeCategory(String category) {
        Assert.assertEquals(new DetailsOfProductPage().getProductCategory(), category);
    }

    @And("I should see price {string}")
    public void iShouldSeePrice(String price) {
        Assert.assertEquals(new DetailsOfProductPage().getProductPrice(), price);
    }

    @And("I should see availability {string}")
    public void iShouldSeeAvailability(String availability) {
        Assert.assertEquals(new DetailsOfProductPage().getProductAvailability(), availability);
    }

    @And("I should see condition {string}")
    public void iShouldSeeCondition(String condition) {
        Assert.assertEquals(new DetailsOfProductPage().getProductCondition(), condition);
    }

    @And("I should see brand {string}")
    public void iShouldSeeBrand(String brand) {
        Assert.assertEquals(new DetailsOfProductPage().getProductBrand(), brand);
    }

    @And("I enter product name {string} in search bar")
    public void iEnterProductNameInSearchBar(String pName) {
        new ProductPage().sendTextToSearchBar(pName);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ProductPage().clickOnSearchButton();
    }

    @Then("I should see the text {string} on the page")
    public void iShouldSeeTheTextOnThePage(String expectedText) {
        Assert.assertEquals(new ProductPage().getSearchedProductsText(), expectedText);
    }

    @And("I should see the searched product {string}")
    public void iShouldSeeTheSearchedProduct(String pName) {
        Assert.assertEquals(new ProductPage().getSearchedProductName(), pName);
    }

    @Then("I add product {string} to the cart")
    public void iAddProductToTheCart(String product) {
        Assert.assertEquals(new ShoppingCartPage().getProductNameFromCart(product), product);
    }

    @And("I click on continue shopping link")
    public void iClickOnContinueShoppingLink() {
        new ProductPage().clickOnContinueShoppingLink();
    }

    @And("I click on view cart in popup")
    public void iClickOnViewCartInPopup() {
    }

    @Then("I verify the product {string} in shopping cart")
    public void iVerifyTheProductInShoppingCart(String arg0) {
    }

    @And("I increase the quantity {string}")
    public void iIncreaseTheQuantity(String quantity) {
        Assert.assertEquals(new ShoppingCartPage().getQuantity(), quantity);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new DetailsOfProductPage().clickOnAddToCartButton();
    }

    @And("I click on view cart link in success message")
    public void iClickOnViewCartLinkInSuccessMessage() {
        new DetailsOfProductPage().clickOnViewCartLinkInSuccessMessage();
    }

    @Then("I should see quantity {string}")
    public void iShouldSeeQuantity(String quantity) {
        Assert.assertEquals(new ShoppingCartPage().getQuantity(), quantity);
    }

    @Then("I click on {string} category")
    public void iClickOnCategory(String category) {
        new ProductPage().clickOnCategory(category);
    }

    @And("I click on {string} in women category")
    public void iClickOnInWomenCategory(String subCategory) {
        new ProductPage().clickOnSubCategoryOfWomen(subCategory);
    }

    @And("I should see {string} page title")
    public void iShouldSeePageTitle(String expectedTitle) {
        Assert.assertEquals(new ProductPage().getSubMenuPageTitle(), expectedTitle);
    }

    @And("I click on {string} in men category")
    public void iClickOnInMenCategory(String subCategory) {
        new ProductPage().clickOnSubCategoryOfMen(subCategory);
    }

    @Then("I click on {string} brand in Brands tab")
    public void iClickOnBrandInBrandsTab(String brand) {
        new ProductPage().clickOnBrandOnBrandsTab(brand);
    }

    @And("I click on header menu option {string}")
    public void iClickOnHeaderMenuOption(String arg0) {
    }

    @Then("I should see the login page text {string}")
    public void iShouldSeeTheLoginPageText(String arg0) {
    }

    @And("I enter {string} email and {string} password for login")
    public void iEnterEmailAndPasswordForLogin(String arg0, String arg1) {
    }

    @And("I click on button {string}")
    public void iClickOnButton(String arg0) {
    }

    @And("I enter {string} name at your name field")
    public void iEnterNameAtYourNameField(String name) {
        new DetailsOfProductPage().sendNameToYourNameField(name);
    }

    @And("I enter {string} email at email address field")
    public void iEnterEmailAtEmailAddressField(String email) {
        new DetailsOfProductPage().sendEmailToEmailAddressField(email);
    }

    @And("I enter {string} message to review here field")
    public void iEnterMessageToReviewHereField(String review) {
        new DetailsOfProductPage().sendReviewToAddReviewField(review);
    }

    @And("I click on review submit button")
    public void iClickOnReviewSubmitButton() {
        new DetailsOfProductPage().clickOnReviewSubmitButton();
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String message) {
        Assert.assertEquals(new DetailsOfProductPage().getThankYouForReviewMessage(), message);
    }

    @When("I scroll down up to recommended items text")
    public void iScrollDownUpToRecommendedItemsText() {
        new HomePage().scrollDownToRecommendedItems();
    }

    @Then("I should see {string} text")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new HomePage().getRecommendedItemText(), expectedText);
    }

    @And("I add to cart {string} product from recommended items")
    public void iAddToCartProductFromRecommendedItems(String pName) {
        new HomePage().clickAddToCartOnRecommendedItems(pName);
    }
}
