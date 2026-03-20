package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.Requests.LoginRequest;
import com.api.models.Response.LoginResponse;
import com.api.models.Response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetProfileRequestTes {

    @Test(description = "bbh")
    public void getProfileInfoTest()
    {
        AuthService authService = new AuthService();
        Response response =authService.login(new LoginRequest("bhaskar_pattepu","Bhaskar@123"));
        // Deserialization System.out.println(response.asPrettyString());
        LoginResponse loginResponse = response.as(LoginResponse.class);
        String token = loginResponse.getToken();
        System.out.println(token);
        System.out.println("Login is completed");

        UserProfileManagementService userProfileManagementService = new
                UserProfileManagementService();
        response = userProfileManagementService.getProfile(token);
        //Serialization
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);

        //System.out.println(userProfileResponse.getUsername());
        //System.out.println(userProfileResponse.getId());
        Assert.assertEquals(userProfileResponse.getUsername(),"bhaskar_pattepu");


    }
}
