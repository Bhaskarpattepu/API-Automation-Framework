package com.api.models.Requests;

public class ProfileRequestPojo {

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    public ProfileRequestPojo(String firstName, String lastName, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "ProfileRequestPojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }


    public static class builder{
        private String firstName;
        private String lastName;
        private String email;
        private String mobileNumber;


        public builder firstname(String firstName)
        {
            this.firstName=firstName;
            return this;
        }
        public builder lastname(String lastName)
        {
            this.lastName=lastName;
            return this;
        }
        public builder email(String email)
        {
            this.email=email;
            return this;
        }

        public builder mobileNumber(String mobileNumber)
        {
            this.mobileNumber=mobileNumber;
            return this;
        }

        public ProfileRequestPojo build()
        {
            ProfileRequestPojo profileRequestPojo = new ProfileRequestPojo(firstName,lastName,email,mobileNumber);
            return profileRequestPojo;
        }

    }
}
