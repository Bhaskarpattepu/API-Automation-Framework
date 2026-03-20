package com.api.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class LoginAPITest {

    @Test(description = "Verify if Login API is working")
    public void loginTest()
    {

        /*
        RequestSpecification x = RestAssured.given();
        RequestSpecification y =x.header("Content-Type","application/json");
        RequestSpecification z = y.body("{\"username\" : \"bhaskar_pattepu\",\"Bhaskar@123\"}");
        Response response =z.post("/api/auth/login");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);
         */

        Response response = given()
                .baseUri("http://64.227.160.186:8080")
                            .header("Content-Type","application/json")
                            .body("{\"username\":\"bhaskar_pattepu\",\"password\":\"Bhaskar@123\"}")
                            .post("/api/auth/login");
        //System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);




    }
}
