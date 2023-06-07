package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class BuyScreen extends BasePageObject {

    private By bagianBeli() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[4]");
    }

    private By bagianBeliCart() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"1\"]");
    }
    @Step
    public void userClickBeliProduct() {
        onClick(bagianBeli());
    }

    @Step
    public boolean theNumberAppearsInTheCartIcon() {
        return waitUntilVisible(bagianBeliCart()).isDisplayed();
    }
}
