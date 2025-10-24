package com.api.base;


import static io.restassured.RestAssured.*;

import com.api.models.Requests.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//This class is responsible for Hanndling baseuri ,creating request and handling Response
public class BaseService {
    private static final String BASE_URL ="http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;

    BaseService()
    {
        requestSpecification= RestAssured.given().baseUri(BASE_URL);
    }
    protected Response postRequest(LoginRequest payload, String endpoint)
    {
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }


}
