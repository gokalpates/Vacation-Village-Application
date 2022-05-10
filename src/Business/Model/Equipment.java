package Business.Model;

public class Equipment {
    private String essn;
    private String name;
    private String purpose;

    public Equipment(String eSSN, String name, String purpose) {
        this.essn = eSSN;
        this.name = name;
        this.purpose = purpose;
    }

    public String getEssn() {
        return essn;
    }

    public void setEssn(String essn) {
        this.essn = essn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
