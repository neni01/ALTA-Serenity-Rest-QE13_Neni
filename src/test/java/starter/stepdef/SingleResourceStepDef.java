package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class SingleResourceStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get single resources with page {}")
    public void getSingleResourcesWithPage(int id) {
        reqresAPI.getSingleResource(id);
    }

    @When("Send request get single resources")
    public void sendRequestGetSingleResources() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCES);
    }

    @And("Validate get single resources json schema {string}")
    public void validateGetSingleResourcesJsonSchema(String json) {
        File jsonSchema = new File(Constants.JSON_SCHEMA+json);
    }

    //scenario single resource not found
    @Given("Get single resources not found with page {}")
    public void getSingleResourcesNotFoundWithPage(int id) {
        reqresAPI.getSingleResourceNotFound(id);
    }

    @When("Send request get single resources not found")
    public void sendRequestGetSingleResourcesNotFound() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCES);
    }
}
