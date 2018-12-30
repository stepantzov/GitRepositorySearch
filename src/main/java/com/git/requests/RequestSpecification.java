package com.git.requests;

import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RequestSpecification {
    public static Response getWithParams(Map pathParams, String basePath) {
        return given()
                .params(pathParams)
                .when()
                .get(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}