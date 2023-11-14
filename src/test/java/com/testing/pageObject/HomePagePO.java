package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    // Element Locator - Stage 1
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SigninLink;

    // Initialize Element Using Selenium - Stage 2
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }


    // Methods To Describe Web Element Action - Stage 3
    public void clickCreateAccountLink(){
        CreateAccountLink.click();

    }

    public void clickSigninLink(){
        SigninLink.click();

    }






















}
