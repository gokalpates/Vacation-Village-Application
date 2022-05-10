package Business.Model.Activity;

public class Activity {
    private Integer ID;
    private String name;
    private String link;
    private String date;
    private String hour;
    private Integer animatorID;

    public Activity(String name, String link, String date, String hour, Integer animatorID) {
        this.name = name;
        this.link = link;
        this.date = date;
        this.hour = hour;
        this.animatorID = animatorID;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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

    public Integer getAnimatorID() {
        return animatorID;
    }

    public void setAnimatorID(Integer animatorID) {
        this.animatorID = animatorID;
    }
}
