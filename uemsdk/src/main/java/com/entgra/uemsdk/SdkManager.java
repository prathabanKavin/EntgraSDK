package com.entgra.uemsdk;

import com.entgra.uemsdk.service.DeviceService;

public class SdkManager {
    private static final String TAG = "SdkManager";

    private static DeviceService deviceService = new DeviceService();

    // Register Device
    public static String registerDevice() {
        return deviceService.registerDevice();
    }
}
