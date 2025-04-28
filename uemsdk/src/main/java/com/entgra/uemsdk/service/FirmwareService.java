package com.entgra.uemsdk.service;

import com.entgra.uemsdk.api.FirmwareAPI;
import com.entgra.uemsdk.model.FirmwareInfo;
import com.entgra.uemsdk.model.OperationResponse;

import java.util.List;

public class FirmwareService {
    private FirmwareAPI firmwareAPI;

    public FirmwareService() {
        firmwareAPI = new FirmwareAPI();
    }

    // Get Available Firmware Updates
    public List<FirmwareInfo> getAvailableFirmwares(String deviceModel, String currentFirmwareVersion) {
        return firmwareAPI.getAvailableFirmwares(deviceModel, currentFirmwareVersion);
    }

    // Create a firmware install operation for the device
    public OperationResponse createFirmwareInstallOperation(String firmwareReleaseId) {
        return firmwareAPI.createFirmwareInstallOperation(firmwareReleaseId);
    }

    public String updateFirmwareOperation(String operationId, String status) {
        return firmwareAPI.updateFirmwareOperation(operationId, status);
    }
}
