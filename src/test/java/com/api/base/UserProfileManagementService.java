package com.api.base;

import com.api.models.Requests.ProfileRequestPojo;
import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {


    private static final String BASE_PATH ="/api/users";

    public Response getProfile(String token)
    {
        setAuthToken(token);
        return getRequest(BASE_PATH+"/profile");
    }
    public Response updateprofile(String token, ProfileRequestPojo payload)
    {
        setAuthToken(token);
        return putRequest(payload,BASE_PATH+"/profile");
    }





}
