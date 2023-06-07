package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject  {
    private By loginPage(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    private By emailField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By xpathErrorDiEmail(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");
    }

    private By errorEmptyPassword(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    }

    private By errorEmptyEmail(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    }
    @Step
    public boolean userOnTheHomePage() {
        return waitUntilVisible(loginPage()).isDisplayed();
    }

    @Step
    public void userClickLoginPage() {
        onClick(loginPage());
    }

    @Step
    public void inputEmail(String email) {
        onClick(emailField());
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void clickLoginButton() {
        onClick(loginButton());
    }

    @Step
    public boolean seeErrorMessage() {
        return waitUntilVisible(xpathErrorDiEmail()).isDisplayed();
    }

    @Step
    public boolean newUserSeeErrorMessage() {
        return waitUntilVisible(errorEmptyPassword()).isDisplayed();
    }

    @Step
    public boolean userSeeErrorMessageInEmail() {
        return waitUntilVisible(errorEmptyEmail()).isDisplayed();
    }

    @Step
    public boolean userSeeErrorMessageInFieldEmail() {
        return waitUntilVisible(errorEmptyEmail()).isDisplayed();
    }

    @Step
    public boolean userSeeErrorMessageInFieldPassword() {
        return waitUntilVisible(errorEmptyPassword()).isDisplayed();
    }
}

