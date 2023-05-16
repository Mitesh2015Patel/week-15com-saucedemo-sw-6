package com.saucedemo.steps;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.Products;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter username  \"([^\"]*)\"$")
    public void iEnterUsername(String userName)  {
        new HomePage().enterUserName(userName);

    }

    @And("^I enter password  \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
          new HomePage().enterpassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @Then("^I should verify text products successfully$")
    public void iShouldVerifyTextProductsSuccessfully() {
        new Products().verifyText();
    }
    @Then("^I should verify six products are displayed on page$")
    public void iShouldVerifySixProductsAreDisplayedOnPage() {
        new Products().verifyProductList();
    }
}
