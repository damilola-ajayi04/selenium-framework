package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class UpdatePasswordPagePO {

    // Element Locator
    @FindBy (css = "#maincontent > div.columns > div.column.main > div.block.block-dashboard-info > div.block-content > div.box.box-information > div.box-actions > a.action.change-password")
    public static WebElement ChangePassword;

    @FindBy (id = "current-password")
    public static WebElement CurrentPasswordField;

    @FindBy (id = "password")
    public static WebElement NewPasswordField;

    @FindBy (id = "password-confirmation")
    public static WebElement ConfirmNewPasswordField;




    // Initialise element using selenium

    public UpdatePasswordPagePO (WebDriver driver){
        PageFactory.initElements(driver, this);


    }

    // Page Specific Method

    public void clickChangePasswordLink(){
        ChangePassword.click();
    }

    public void enterCurrentPassword(String CurrentPassword){
        CurrentPasswordField.sendKeys(CurrentPassword);
    }
    public void enterNewPassword(String NewPassword){
        NewPasswordField.sendKeys(NewPassword);
    }
    public void enterConfirmNewPassword(String ConfirmNewPassword){
        ConfirmNewPasswordField.sendKeys(ConfirmNewPassword);
    }

}
