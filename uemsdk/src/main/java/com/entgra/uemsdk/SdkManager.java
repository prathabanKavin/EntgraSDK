package com.entgra.uemsdk;

import com.entgra.uemsdk.model.FirmwareInfo;
import com.entgra.uemsdk.model.OperationResponse;
import com.entgra.uemsdk.service.DeviceService;
import com.entgra.uemsdk.service.FirmwareService;

import java.util.List;

public class SdkManager {
    private static final String TAG = "SdkManager";

    private static DeviceService deviceService = new DeviceService();
    private static FirmwareService firmwareService = new FirmwareService();

    // Register Device
    public static String registerDevice(String serialNumber) {
        return deviceService.registerDevice(serialNumber);
    }

    // Get available firmwares
    public static List<FirmwareInfo> getAvailableFirmwares(String deviceModel, String currentFirmwareVersion) {
        return firmwareService.getAvailableFirmwares(deviceModel, currentFirmwareVersion);
    }

    // Create a firmware install operation for the device
    public static OperationResponse createFirmwareInstallOperation(String firmwareReleaseId) {
        return firmwareService.createFirmwareInstallOperation(firmwareReleaseId);
    }

    // Update the operation status
    public static String updateFirmwareOperation(String operationId, String status) {
        return firmwareService.updateFirmwareOperation(operationId, status);
    }
}
