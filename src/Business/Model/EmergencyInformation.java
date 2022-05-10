package Business.Model;

public class EmergencyInformation {
    private Integer activityID;
    private String phoneNumber;
    private Integer lockerNumber;

    public EmergencyInformation(Integer activityID, String phoneNumber, Integer lockerNumber) {
        this.activityID = activityID;
        this.phoneNumber = phoneNumber;
        this.lockerNumber = lockerNumber;
    }

    public Integer getActivityID() {
        return activityID;
    }

    public void setActivityID(Integer activityID) {
        this.activityID = activityID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getLockerNumber() {
        return lockerNumber;
    }

    public void setLockerNumber(Integer lockerNumber) {
        this.lockerNumber = lockerNumber;
    }
}
