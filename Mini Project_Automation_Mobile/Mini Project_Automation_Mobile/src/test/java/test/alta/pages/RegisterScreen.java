package test.alta.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {
    public String name = createRandomName();
    public String password = "password@32!";
    private By loginPagee(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By registerLink() {
        return MobileBy.AccessibilityId("Register");
    }

    private By nameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }

    private By registerButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    private By gagalMessage() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
    }


    @Step
    public void loginPage() {
        onClick(loginPagee());
    }
    @Step
    public void userClickRegisterLink() {
        onClick(registerLink());
    }

    @Step
    public void inputName() {
        onClick(nameField());
        Faker faker = new Faker();
        name = faker.name().firstName();
        onType(nameField(), name);
    }

    @Step
    public void inputEmail() {
        onClick(emailField());
        onType(emailField(), name + "@gmail.com");
    }

    @Step
    public void inputPassword() {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void userClickRegisterButton() {
        onClick(registerButton());
    }

    @Step
    public boolean userGetErrorMessage() {
        return waitUntilVisible(gagalMessage()).isDisplayed();
    }

    public String createRandomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
}
