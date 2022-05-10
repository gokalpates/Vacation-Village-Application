package Business.Model;

public class Appointment {
    private Integer customerID;
    private Integer activityID;
    private int animatorID;
    private String date;
    private String hour;


    public Appointment(Integer customerID, Integer activityID, int animatorID, String date, String hour) {
        this.customerID = customerID;
        this.activityID = activityID;
        this.animatorID = animatorID;
        this.date = date;
        this.hour = hour;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getActivityID() {
        return activityID;
    }

    public void setActivityID(Integer activityID) {
        this.activityID = activityID;
    }

    public int getAnimatorID() {
        return animatorID;
    }

    public void setAnimatorID(int animatorID) {
        this.animatorID = animatorID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
