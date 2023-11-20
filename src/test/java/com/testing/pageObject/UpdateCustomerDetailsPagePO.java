package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateCustomerDetailsPagePO {


    // Element Locator
@FindBy (css = "#maincontent > div.columns > div.column.main > div.block.block-addresses-default > div.block-content > div.box.box-address-shipping > div.box-actions > a > span")
    public static WebElement ChangeShippingAddress;
@FindBy (id = "street_1")
    public static WebElement StreetAddressField;
@FindBy (id = "city")
    public static WebElement CityField;
@FindBy (id = "zip")
    public static WebElement ZipField;


   // Initialise using selenium
    public UpdateCustomerDetailsPagePO (WebDriver driver){
    PageFactory.initElements(driver, this);
    }


    // Method

    public void clickChangeShippingAddress(){
        ChangeShippingAddress.click();
    }

    public void enterStreetAddress(String StreetAddress) {
        StreetAddressField.sendKeys(StreetAddress);
    }

        public void enterCity(String City){
        CityField.sendKeys(City);
    }

       public void enterZipcode(String Zipcode){
        ZipField.sendKeys(Zipcode);
       }








}


