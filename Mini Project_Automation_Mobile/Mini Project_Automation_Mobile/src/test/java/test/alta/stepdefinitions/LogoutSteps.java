package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.LogoutScreen;

public class LogoutSteps {
    @Steps
    LogoutScreen logoutScreen;


    @And("user click login page to log in")
    public void userClickLoginPageToLogIn() {
        logoutScreen.userClickLoginPageToLogIn();
    }
    @When("new user input {string} on email field")
    public void inputEmail(String email){
        logoutScreen.inputEmail(email);
    }

    @And("new user input {string} on password field")
    public void inputPassword(String password){
        logoutScreen.inputPassword(password);
    }

    @And("new user click login button")
    public void clickLoginButton() {
        logoutScreen.clickLoginButton();
    }
    @When("user clicks the logout button")
    public void userClicksTheLogoutButton() {
        logoutScreen.userClicksTheLogoutButton();
    }

    @Then("user should be logged out of their account")
    public void userShouldBeLoggedOutOfTheirAccount() {
        logoutScreen.userShouldBeLoggedOutOfTheirAccount();
    }
}
