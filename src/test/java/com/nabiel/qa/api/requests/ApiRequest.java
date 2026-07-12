package com.nabiel.qa.api.requests;

import com.nabiel.qa.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiRequest {

    public Response getTags() {
        return RestAssured
                .given()
                .header("app-id", ConfigReader.getProperty("app.id"))
                .baseUri(ConfigReader.getProperty("api.base.url"))
                .when()
                .get("/tag");
    }
}