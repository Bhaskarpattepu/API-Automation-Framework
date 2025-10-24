package com.api.models.Requests;

public class LoginRequest {
    private String usename;
    private String password;

    public LoginRequest(String usename, String password) {
        super();
        this.usename = usename;
        this.password = password;
    }

    public String getUsename() {
        return usename;
    }

    public String getPassword() {
        return password;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
