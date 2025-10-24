package com.api.tests;

import com.api.base.AuthService;
import com.api.models.Requests.LoginRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest3 {

    @Test(description = "Verify if Login is working")
    public void loginTest()
    {
        AuthService authService = new AuthService();
        LoginRequest loginRequest = new LoginRequest("bhaskar_pattepu","Bhaskar@123");
        Response response = authService.login(loginRequest);
        System.out.println(response.asPrettyString());
        //Assert.assertEquals(response.getStatusCode(),200);
    }
}
