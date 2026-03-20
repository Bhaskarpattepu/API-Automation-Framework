package com.api.tests;

import com.api.base.AuthService;
import com.api.models.Requests.SignUpRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreationTest2 {

    @Test(description = "Verify if Login is working")
    public void createAccountTest()
    {
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("bhaskar.pattepu123@gmail.com");
        System.out.println(response.asPrettyString());
    }

}
