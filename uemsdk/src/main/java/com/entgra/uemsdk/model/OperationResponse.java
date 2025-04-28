package com.entgra.uemsdk.model;

import java.util.List;

public class OperationResponse {
    private String activityId;
    private String code;
    private int operationId;
    private String type;
    private String createdTimeStamp;
    private List<ActivityStatus> activityStatus;

    public List<ActivityStatus> getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(List<ActivityStatus> activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    public void setCreatedTimeStamp(String createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public static class ActivityStatus {
        private DeviceIdentifier deviceIdentifier;
        private String firmwareReleaseId;
        private String status;

        public DeviceIdentifier getDeviceIdentifier() {
            return deviceIdentifier;
        }

        public void setDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
            this.deviceIdentifier = deviceIdentifier;
        }

        public String getFirmwareReleaseId() {
            return firmwareReleaseId;
        }

        public void setFirmwareReleaseId(String firmwareReleaseId) {
            this.firmwareReleaseId = firmwareReleaseId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public static class DeviceIdentifier {
        private String id;
        private String type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
