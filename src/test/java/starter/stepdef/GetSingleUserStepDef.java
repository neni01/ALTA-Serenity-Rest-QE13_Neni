package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetSingleUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get single user with page {string}")
    public void getSingleUserWithPage(String page) {
        reqresAPI.getSingleUser(page);
    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_USERS);
    }

    //Scenario get single user not found
    @Given("Get single user not found with page {string}")
    public void getSingleUserNotFoundWithPage(String page) {
        reqresAPI.getSingleUserNotFound(page);
    }
}
