package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class LoginStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Post login user with valid json {string}")
    public void postLoginUserWithValidJson(String json) {
        File jsonLogin = new File(Constants.REQ_BODY+ json);
        reqresAPI.postLoginUser(jsonLogin);
    }

    @When("Send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(ReqresAPI.POST_LOGIN);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @And("Validate login user json schema {string}")
    public void validateLoginUserJsonSchema(String json) {
        File jsonSchema = new File(Constants.JSON_SCHEMA+json);
    }

    //scenario invalid login
    @Given("Post login user with invalid json {string}")
    public void postLoginUserWithInvalid(String json) {
        File jsonLoginInvalid = new File(Constants.REQ_BODY+ json);
        reqresAPI.postLoginInvalid(jsonLoginInvalid);
    }
}
