package com.nabiel.qa.api.requests;

import com.nabiel.qa.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class UserRequest {

    private final String baseUrl = ConfigReader.getProperty("api.base.url");
    private final String appId = ConfigReader.getProperty("app.id");

    public Response getUserById(String id) {

        return RestAssured
                .given()
                .baseUri(baseUrl)
                .header("app-id", appId)
                .when()
                .get("/user/" + id);
    }

    public Response createUser() {

        Map<String, String> body = new HashMap<>();
        body.put("title", "mr");
        body.put("firstName", "Nabiel");
        body.put("lastName", "QA");
        body.put("email", "nabielqa" + System.currentTimeMillis() + "@mail.com");

        return RestAssured
                .given()
                .baseUri(baseUrl)
                .header("app-id", appId)
                .contentType("application/json")
                .body(body)
                .when()
                .post("/user/create");
    }

    public Response updateUser(String id) {

        Map<String, String> body = new HashMap<>();
        body.put("firstName", "Updated");

        return RestAssured
                .given()
                .baseUri(baseUrl)
                .header("app-id", appId)
                .contentType("application/json")
                .body(body)
                .when()
                .put("/user/" + id);
    }

    public Response deleteUser(String id) {

        return RestAssured
                .given()
                .baseUri(baseUrl)
                .header("app-id", appId)
                .when()
                .delete("/user/" + id);
    }
}