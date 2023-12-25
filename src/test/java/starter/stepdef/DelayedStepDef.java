package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class DelayedStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get delayed response with page {}")
    public void getDelayedResponseWithPage(int id) {
        reqresAPI.getDelayResponse(id);
    }

    @When("Send request get delayed response")
    public void sendRequestGetDelayedResponse() {
        SerenityRest.when().get(ReqresAPI.GET_DELAY);
    }
}
