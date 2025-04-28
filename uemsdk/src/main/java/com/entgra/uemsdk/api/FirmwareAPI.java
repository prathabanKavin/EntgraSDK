package com.entgra.uemsdk.api;

import com.entgra.uemsdk.model.FirmwareInfo;
import com.entgra.uemsdk.model.OperationResponse;

import java.util.ArrayList;
import java.util.List;

public class FirmwareAPI {

    public List<FirmwareInfo> getAvailableFirmwares(String deviceModel, String currentFirmwareVersion) {
        // TODO: Replace with real response for available firmware
        List<FirmwareInfo> firmwareList = new ArrayList<>();

        FirmwareInfo firmware1 = new FirmwareInfo();
        firmware1.setDeviceModelId(deviceModel);
        firmware1.setOsVersion("Android 14");
        firmware1.setFirmwareVersion("v1.1.0");
        firmware1.setFirmwareReleaseId("firmware-002-1");
        firmware1.setBuildNumber("G991BXXS7DWI8");
        firmware1.setReleaseType("Stable");
        firmware1.setDownloadUrl("https://firmware.example.com/" + deviceModel + "/android14/v1.1.0/firmware.zip");
        firmware1.setFileSize(1400000000L);
        firmware1.setChecksum("9d5ed678fe57bcca610140957afab571");

        FirmwareInfo firmware2 = new FirmwareInfo();
        firmware2.setDeviceModelId(deviceModel);
        firmware2.setOsVersion("Android 14");
        firmware2.setFirmwareVersion("v1.2.3");
        firmware2.setFirmwareReleaseId("firmware-002-2");
        firmware2.setBuildNumber("G991BXXS9EWK6");
        firmware2.setReleaseType("Stable");
        firmware2.setDownloadUrl("https://firmware.example.com/" + deviceModel + "/android14/v1.2.3/firmware.zip");
        firmware2.setFileSize(1572864000L);
        firmware2.setChecksum("5d41402abc4b2a76b9719d911017c592");

        firmwareList.add(firmware1);
        firmwareList.add(firmware2);

        return firmwareList;
    }

    public OperationResponse createFirmwareInstallOperation(String firmwareReleaseId) {
        OperationResponse response = new OperationResponse();

        response.setActivityId("ACTIVITY_4740");
        response.setCode("FIRMWARE_INSTALL");
        response.setOperationId(1);
        response.setType("PROFILE");
        response.setCreatedTimeStamp("Sun Apr 27 08:19:13 UTC 2025");

        OperationResponse.ActivityStatus status = new OperationResponse.ActivityStatus();
        OperationResponse.DeviceIdentifier deviceIdentifier = new OperationResponse.DeviceIdentifier();
        deviceIdentifier.setId("ABC123456789");
        deviceIdentifier.setType("android");

        status.setDeviceIdentifier(deviceIdentifier);
        status.setFirmwareReleaseId(firmwareReleaseId);
        status.setStatus("PENDING");

        response.setActivityStatus(List.of(status));

        return response;
    }

    public String updateFirmwareOperation(String operationId, String status) {
        return "{\"data\":\"OperationStatus updated successfully.\"}";
    }
}
