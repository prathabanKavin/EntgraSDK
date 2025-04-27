package com.entgra.uemsdk.model;

import java.util.List;

public class ConfigurationResponse {
    private String deviceId;
    private String deviceType;
    private String tenantDomain;
    private String accessToken;
    private String deviceOwner;
    private List<ConfigurationEntry> configurationEntries;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getTenantDomain() {
        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public List<ConfigurationEntry> getConfigurationEntries() {
        return configurationEntries;
    }

    public void setConfigurationEntries(List<ConfigurationEntry> configurationEntries) {
        this.configurationEntries = configurationEntries;
    }
}
