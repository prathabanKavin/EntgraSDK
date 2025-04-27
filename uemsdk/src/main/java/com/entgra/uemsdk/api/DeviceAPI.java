package com.entgra.uemsdk.api;

import com.entgra.uemsdk.model.ConfigurationEntry;
import com.entgra.uemsdk.model.ConfigurationResponse;

import java.util.ArrayList;
import java.util.List;

public class DeviceAPI {

    public static ConfigurationResponse getDeviceConfig(String serial, String configToken) {
        // TODO: Replace with real response from configuration endpoint
        if (serial == null || configToken == null) {
            return null;
        }

        ConfigurationResponse response = new ConfigurationResponse();
        response.setDeviceId("device-id");
        response.setDeviceType("android");
        response.setTenantDomain("carbon.super");
        response.setAccessToken(configToken);
        response.setDeviceOwner("admin");

        ConfigurationEntry entry = new ConfigurationEntry();
        entry.setKey("serial");
        entry.setValue(serial);

        List<ConfigurationEntry> configList = new ArrayList<>();
        configList.add(entry);
        response.setConfigurationEntries(configList);

        return response;
    }
}
