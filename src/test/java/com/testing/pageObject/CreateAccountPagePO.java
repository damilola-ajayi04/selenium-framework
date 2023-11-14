package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    // Element Locator - Stage 1

    @FindBy(id = "firstname")
    public static WebElement FirstnameField;

    @FindBy(id = "lastname")
    public static WebElement LastnameField;

    @FindBy(name = "email")
    public static WebElement EmailField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmpasswordField;

    @FindBy (css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;


    // Initialize Element Using Selenium - Stage 2
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    // Methods To Describe Web Element Action - Stage 3

    public void enterFirstname(String Firstname){
        FirstnameField.sendKeys(Firstname);

    }

    public void enterLastname(String Lastname){
        LastnameField.sendKeys(Lastname);

    }

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);

    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);

    }

    public void enterConfirmpassword(String Confirmpassword){
        ConfirmpasswordField.sendKeys(Confirmpassword);

    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();
    }












}
