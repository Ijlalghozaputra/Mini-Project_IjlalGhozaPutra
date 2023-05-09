package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    @Given("I open home page")
    public void openRegisterPage(){
        registerPage.openRegisterPage();
    }

    @When("I input new username")
    public void inputNewUsername(){
        registerPage.inputNewUsername();
    }

    @When("I input new email")
    public void inputNewEmail(){
        registerPage.inputNewEmail();
    }

    @When("I input new password")
    public void inputNewPassword(){
        registerPage.inputNewPassword();
    }

    @When("I click register button")
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @Then("I should be redirected to login page")
    public void validateLoginPage(){
        registerPage.validateLoginPage();
    }
}
