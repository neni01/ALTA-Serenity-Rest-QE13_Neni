package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class ReqresAPI {
    public static String GET_LIST_USERS = Constants.BASE_URL+"/api/users?page={page}";
    public static String GET_SINGLE_USERS = Constants.BASE_URL+"/api/users/{page}";
    public static String GET_LIST_RESOURCES = Constants.BASE_URL+"/api/{page}";
    public static String GET_SINGLE_RESOURCES = Constants.BASE_URL+"/api/unknown/{id}";
    public static String GET_DELAY = Constants.BASE_URL+"/api/users?delay={id}";
    public static String POST_CREATE_USER = Constants.BASE_URL+"/api/users";
    public static String UPDATE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String DELETE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String POST_LOGIN = Constants.BASE_URL+"/api/login";
    public static String POST_REGISTER = Constants.BASE_URL+"/api/register";

    @Step("Get list users")
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page", page);
    }
    @Step("Post create new user")
    public void postCreateUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Update user")
    public void updateUser(int id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    //Scenario delete
    @Step("Delete user")
    public void deleteUser(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    //Scenario Login
    @Step("Post login user")
    public void postLoginUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    @Step("Post login invalid user")
    public void postLoginInvalid(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    //Scenario Register
    @Step("Post register user")
    public void postRegister(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    @Step("Post register invalid user")
    public void postRegisterInvalid(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    //Scenario single user
    @Step("Get single users")
    public void getSingleUser(String page){
        SerenityRest.given()
                .pathParam("page", page);
    }
    //Scenario single user not found
    @Step("Get single users not found")
    public void getSingleUserNotFound(String page){
        SerenityRest.given().pathParam("page", page);
    }
    //Scenario list resource
    @Step("Get list resources")
    public void getListResource(String page){
        SerenityRest.given().pathParam("page", page);
    }
    //Scenario single resource
    @Step("Get single resources")
    public void getSingleResource(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    //scenario single resource not found
    @Step("Get single resources not found")
    public void getSingleResourceNotFound(int id){
        SerenityRest.given().pathParam("id", id);
    }
    //Scenario delay response
    @Step("Get delayed response")
    public void getDelayResponse(int id){
        SerenityRest.given().pathParam("id", id);
    }

    //Scenario patch update user
    @Step("Patch update user")
    public void patchUpdateUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

}
