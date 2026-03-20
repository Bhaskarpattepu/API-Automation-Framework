package com.api.tests;

import com.api.base.AuthService;
import com.api.models.Requests.SignUpRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreationTest {

    @Test(description = "Verify if Login is working")
    public void createAccountTest()
    {

       SignUpRequest signUpRequest =  new SignUpRequest.Builder().userName("Dishaaa")
                .email("dishaa@yahooo.com")
                .firstName("Dishaaa")
                .password("disha1234")
                .lastName("Bhatt")
                .mobileNumber("7777777776")
                .build();
        AuthService authService = new AuthService();
        Response response = authService.signup(signUpRequest);
        
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asPrettyString(),"User registered successfully!");
    }

}
