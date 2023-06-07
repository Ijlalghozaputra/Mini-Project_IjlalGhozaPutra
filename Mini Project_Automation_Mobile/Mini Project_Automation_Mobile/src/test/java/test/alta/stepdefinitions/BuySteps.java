package test.alta.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.BuyScreen;

public class BuySteps {
    @Steps
    BuyScreen buy;
    @When("user click Beli product")
    public void userClickBeliProduct() {
        buy.userClickBeliProduct();
    }

    @Then("the number appears in the cart icon")
    public void theNumberAppearsInTheCartIcon() {
        buy.theNumberAppearsInTheCartIcon();
    }
}
