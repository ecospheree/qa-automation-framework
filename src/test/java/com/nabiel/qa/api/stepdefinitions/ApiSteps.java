package com.nabiel.qa.api.stepdefinitions;

import com.nabiel.qa.api.requests.ApiRequest;
import com.nabiel.qa.api.requests.UserRequest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class ApiSteps {

    ApiRequest apiRequest = new ApiRequest();
    UserRequest userRequest = new UserRequest();

    Response response;
    String userId;

    // ===========================
    // TAG API
    // ===========================

    @When("User requests tag list")
    public void userRequestsTagList() {
        response = apiRequest.getTags();
    }

    // ===========================
    // USER API
    // ===========================

    @When("User creates new user")
    public void userCreatesNewUser() {
        response = userRequest.createUser();
        userId = response.jsonPath().getString("id");
    }

    @When("User gets created user")
    public void userGetsCreatedUser() {
        response = userRequest.getUserById(userId);
    }

    @When("User updates created user")
    public void userUpdatesCreatedUser() {
        response = userRequest.updateUser(userId);
    }

    @When("User deletes created user")
    public void userDeletesCreatedUser() {
        response = userRequest.deleteUser(userId);
    }

    // ===========================
    // COMMON ASSERTION
    // ===========================

    @Then("Response status code should be {int}")
    public void responseStatusCodeShouldBe(Integer statusCode) {
        assertEquals(statusCode.intValue(), response.getStatusCode());
    }
}