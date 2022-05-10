package Business.Model.User;

public class EquipPerson {
    private Integer ID;
    private String ssn;
    private String name;
    private String surname;
    private String phoneNum;

    public EquipPerson(Integer ID, String ssn, String name, String surname, String phoneNum) {
        this.ID = ID;
        this.ssn = ssn;
        this.name = name;
        this.surname = surname;
        this.phoneNum = phoneNum;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
