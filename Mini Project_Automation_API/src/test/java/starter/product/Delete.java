package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set DELETE api endpoint")
    public String setDeleteApiEndpoint(){
        return url+"products/13364";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}