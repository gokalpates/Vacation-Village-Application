package Business.Model.User;

public class Animator {
    private Integer ID;
    private String name;
    private String phoneNum;
    private String expArea;

    public Animator(String name, String phoneNum, String expArea) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.expArea = expArea;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getExpArea() {
        return expArea;
    }

    public void setExpArea(String expArea) {
        this.expArea = expArea;
    }
}
