package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class UpdateUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Update user with valid json {string}")
    public void updateUserWithValidJson(String json) {
        File jsonUpdateUser = new File(Constants.REQ_BODY+ json);
        reqresAPI.patchUpdateUser(jsonUpdateUser);
    }
}
