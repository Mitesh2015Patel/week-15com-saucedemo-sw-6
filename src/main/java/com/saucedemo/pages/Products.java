package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class Products extends Utility {
    private static final Logger log = LogManager.getLogger(Products.class.getName());

    public Products(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productsText;


    public String verifyText() {
        Reporter.log("Verify Text" + productsText.toString());
        log.info("verify text : " + productsText.toString());
        return getTextFromElement(productsText);

    }

    public int verifyProductList() {
        List<WebElement> number = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        return number.size();
    }

//    public int getSize(By by){
//        List<WebElement> number = driver.findElements(by);
//        return number.size();
//    }

   // public List<WebElement> webElementList(By by){
     //   return driver.findElements(by);
    }


