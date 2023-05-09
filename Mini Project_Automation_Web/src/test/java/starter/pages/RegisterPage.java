package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
public class RegisterPage extends PageObject {
    private By emailField(){
        return By.id("input-3037");
    }
    private By fullnameField(){
        return By.id("input-3034");
    }
    private By passwordField(){
        return By.id("input-3040");
    }
    private By registerButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button/span");
    }
    private By buttonToRegister(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span/i");
    }
    private By linkToRegister(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div/a");
    }
    private By loginPageTitle(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]");
    }
    @Step
    public void openRegisterPage(){
        open();
        $(buttonToRegister()).click();
        $(linkToRegister()).click();
    }

    @Step
    public void inputNewUsername(){
        $(fullnameField()).type("Ijlalghoza");
    }

    @Step
    public void inputNewEmail(){
        $(emailField()).type("jlalll@mail.com");
    }

    @Step
    public void inputNewPassword(){
        $(passwordField()).type("123123");
    }

    @Step
    public void clickRegisterButton(){
        $(registerButton()).click();
    }

    @Step
    public void validateLoginPage(){
        $(loginPageTitle()).isDisplayed();
    }
}
