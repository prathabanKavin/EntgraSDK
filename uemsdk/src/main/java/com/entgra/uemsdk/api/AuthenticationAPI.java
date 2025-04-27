package com.entgra.uemsdk.api;

public class AuthenticationAPI {

    public boolean authenticate(String accessToken) {
        // Use accessToken to authenticate
        if(accessToken == null){
            return false;
        }
        return true;
    }
}
