package Business.Model.Activity;

public class IndividualActivity extends Activity {

    private String age;

    public IndividualActivity(String name, String link, String date, String hour, Integer animatorID, String age) {
        super(name, link, date, hour, animatorID);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
