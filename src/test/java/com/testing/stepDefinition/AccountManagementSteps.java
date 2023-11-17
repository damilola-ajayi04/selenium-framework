package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {

    WebDriver driver = Hooks.driver;
    @Given("I am on create account page")
    public void iAmOnCreateAccountPage() {

        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String Firstname, String Lastname, String Email, String Password, String Confirmpassword) {

        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstname(Firstname);
        createAccountPagePO.enterLastname(Lastname);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmpassword(Confirmpassword);

    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {

        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
    }

    @Given("I am on sign in page")
    public void iAmOnSignInPage() {

        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSigninLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {

        SignInAccountPagePO signInAccountPagePO = new SignInAccountPagePO(driver);
        signInAccountPagePO.enterEmail(Email);
        signInAccountPagePO.enterPassword(Password);
    }

    @And("I click on sign in")
    public void iClickOnSignIn() {

        SignInAccountPagePO signInAccountPagePO = new SignInAccountPagePO(driver);
        signInAccountPagePO.clickSignInButton();
    }


    @Then("My account welcome page should be displayed")
    public void myAccountWelcomePageShouldBeDisplayed() {
    }



    @Then("Account already exist should displayed")
    public void accountAlreadyExistShouldDisplayed() {
    }



    @Then("Unregistered account should displayed")
    public void unregisteredAccountShouldDisplayed() {
    }

}






