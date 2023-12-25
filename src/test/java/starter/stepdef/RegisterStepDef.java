package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class RegisterStepDef {
    @Steps
    ReqresAPI reqresAPI;
    //scenario register valid
    @Given("Post register user with json {string}")
    public void postRegisterUser(String json) {
        File jsonRegister = new File(Constants.REQ_BODY+ json);
        reqresAPI.postRegister(jsonRegister);
    }

    @When("Send request post register user")
    public void sendRequestPostRegisterUser() {
        SerenityRest.when().post(ReqresAPI.POST_REGISTER);
    }

    @And("Validate json schema {string}")
    public void validateJsonSchemaString(String json) {
        File jsonSchema = new File(Constants.JSON_SCHEMA+json);
    }

    //Scenario register invalid
    @Given("Post register with json {string}")
    public void postRegisterInvalidUser(String json) {
        File jsonRegisterInvalid = new File(Constants.REQ_BODY+ json);
        reqresAPI.postRegisterInvalid(jsonRegisterInvalid);
    }
}
