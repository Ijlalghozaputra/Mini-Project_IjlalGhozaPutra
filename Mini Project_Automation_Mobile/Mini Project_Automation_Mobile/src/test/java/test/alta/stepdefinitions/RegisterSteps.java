package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;
import test.alta.pages.RegisterScreen;

public class RegisterSteps {

    @Steps
    RegisterScreen registerScreen;
    @Steps
    LoginScreen loginScreen;

    @Given("new user on the home page")
    public void userOnTheHomePage() {
        loginScreen.userOnTheHomePage();
    }
    @And("new user click login page")
    public void userClickLoginPage() {
        loginScreen.userClickLoginPage();
    }
    @And("login page")
    public void loginPage() {
        registerScreen.loginPage();
    }

    @When("user click register link")
    public void userClickRegisterLink() {
        registerScreen.userClickRegisterLink();
    }

    @And("user input name on name field")
    public void inputName() {
        registerScreen.inputName();
    }

    @And("user input email on email field")
    public void inputEmail() {
        registerScreen.inputEmail();
    }

    @And("user input password on password field")
    public void inputPassword() {
        registerScreen.inputPassword();
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerScreen.userClickRegisterButton();
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String arg0) {
        registerScreen.userGetErrorMessage();
    }
}
