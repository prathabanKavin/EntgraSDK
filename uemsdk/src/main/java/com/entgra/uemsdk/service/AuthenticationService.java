package com.entgra.uemsdk.service;

import com.entgra.uemsdk.api.AuthenticationAPI;

public class AuthenticationService {
    private AuthenticationAPI authenticationAPI;

    public AuthenticationService() {
        authenticationAPI = new AuthenticationAPI();
    }

    public boolean authenticateCertificate(String accessToken) {
        return authenticationAPI.authenticate(accessToken);
    }
}
