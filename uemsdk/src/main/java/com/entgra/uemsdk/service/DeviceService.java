package com.entgra.uemsdk.service;

import com.entgra.uemsdk.api.DeviceAPI;
import com.entgra.uemsdk.model.ConfigurationResponse;

public class DeviceService {
    private DeviceAPI deviceAPI;
    private final AuthenticationService authenticationService;

    public DeviceService() {
        this.deviceAPI = new DeviceAPI();
        this.authenticationService = new AuthenticationService();
    }

    // Register Device
    public String registerDevice(String serialNumber) {
        // TODO: Retrieve configToken from configs
        String configToken = "casper408";

        // Get configuration from MDM server based on serial number
        ConfigurationResponse configResponse = deviceAPI.getDeviceConfig(serialNumber, configToken);

        if (configResponse != null) {
            // Authenticate certificate and enroll device
            if (authenticationService.authenticateCertificate(configResponse.getAccessToken())) {
                return "Device enrolled successfully.";
            }
            return "Device certificate authentication failed.";
        }
        return "Device registration failed.";
    }
}
