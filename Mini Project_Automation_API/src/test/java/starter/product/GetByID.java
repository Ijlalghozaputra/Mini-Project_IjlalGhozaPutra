package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetByID {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET api endpoint for get product by ID")
    public String setApiEndpointForGetProductByID(){
        return url+"products/13364";
    }

    @Step("I send GET HTTP request for get product by ID")
    public void sendGetHttpRequestForGetProductByID(){
        SerenityRest.given().get(setApiEndpointForGetProductByID());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}