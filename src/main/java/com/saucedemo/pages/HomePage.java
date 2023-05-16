package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void enterUserName(String userName) {
        log.info("Enter User name: " + userNameField.toString());
        Reporter.log("Enter User Name " + userNameField.toString());
        sendTextToElement(userNameField, userName);

    }


    public void enterpassword(String password) {
        Reporter.log("Enter password " + passwordField.toString());
        log.info("Enter password: " + passwordField.toString());
        sendTextToElement(passwordField, password);


    }

    public void clickOnLoginButton() {
        Reporter.log("Click on login button " + loginButton.toString());
        log.info("Click on login button : " + loginButton.toString());
        clickOnElement(loginButton);

    }


}
