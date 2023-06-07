package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.alta.pages.LoginScreen;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    LoginScreen loginScreen;

    @Given("user on the home page")
    public void userOnTheHomePage() {
        loginScreen.userOnTheHomePage();
    }
    @And("user click login page")
    public void userClickLoginPage() {
        loginScreen.userClickLoginPage();
    }

    @When("user input {string} on email field")
    public void inputEmail(String email){
        loginScreen.inputEmail(email);
    }

    @And("user input {string} on password field")
    public void inputPassword(String password){
        loginScreen.inputPassword(password);
    }

    @And("user click login button")
    public void clickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("user see error message {string}")
    public void seeErrorMessage(String arg0){
        loginScreen.seeErrorMessage();
    }

    @Then("user see error message {string} in password")
    public void newUserSeeErrorMessage(String arg0) {
        loginScreen.newUserSeeErrorMessage();
    }

    @Then("user see error message {string} in email")
    public void userSeeErrorMessageInEmail(String arg0) {
        loginScreen.userSeeErrorMessageInEmail();
    }

    @Then("user see error message {string} in field email")
    public void userSeeErrorMessageInFieldEmail(String arg0) {
        loginScreen.userSeeErrorMessageInFieldEmail();
    }

    @Then("user see error message {string} in field password")
    public void userSeeErrorMessageInFieldPassword(String arg0) {
        loginScreen.userSeeErrorMessageInFieldPassword();
    }
}
