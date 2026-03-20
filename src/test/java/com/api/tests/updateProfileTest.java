package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.Requests.LoginRequest;
import com.api.models.Requests.ProfileRequestPojo;
import com.api.models.Response.LoginResponse;
import com.api.models.Response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class updateProfileTest {

    @Test(description = "bb")
public void updateprofiletest()
{
    AuthService authService = new AuthService();
    Response response = authService.login(new LoginRequest("bhaskar_pattepu","Bhaskar@123"));
    LoginResponse loginResponse = response.as(LoginResponse.class);

    UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
    userProfileManagementService.getProfile(loginResponse.getToken());
    System.out.println(response.asPrettyString());
    UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
    Assert.assertEquals(userProfileResponse.getUsername(),"bhaskar_pattepu");


    ProfileRequestPojo profileRequestPojo = new ProfileRequestPojo.builder()
            .firstname("bhas")
            .lastname("_patt")
            .email("bhaskar.pattepu123@gmail.com")
            .mobileNumber("1234567890")
            .build();


    Response response1 = userProfileManagementService.updateprofile(loginResponse.getToken(),profileRequestPojo);
    System.out.println(response1.asPrettyString());
    System.out.println(response1.statusCode());


}
}
