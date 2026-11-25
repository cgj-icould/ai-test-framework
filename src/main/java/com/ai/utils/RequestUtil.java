package com.ai.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestUtil {
    private static final String BASE_URL = "https://httpbin.org";

    public static io.restassured.response.Response post(String path, Object body) {
        RequestSpecification request = RestAssured.given()
                .baseUri(BASE_URL)
                .contentType("application/json")
                .log().all();
        return request.body(body).post(path);
    }
}