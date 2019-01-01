package com.git.requestSpecification;

import io.restassured.response.Response;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestRequest {
    public static Response getResponseWithParams(Map pathParams, String basePath) {
        return given()
                .params(pathParams)
                .when()
                .get(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    public static Response getResponseWithDirectUrl(String releasesUrl) {
        return given()
                .when()
                .get(releasesUrl)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}