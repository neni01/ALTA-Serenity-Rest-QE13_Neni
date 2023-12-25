package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class ListResourceStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Get list resources with page {}")
    public void getListResourcesWithPage(String page) {
        reqresAPI.getListResource(page);
    }

    @When("Send request get list resources")
    public void sendRequestGetListResources() {
        SerenityRest.when().get(ReqresAPI.GET_LIST_RESOURCES);
    }

}
