package DB.DAO;

import Business.Model.Appointment;
import DB.DbContext;

public class AppointmentDAO {

    public void addAppointment(Appointment appointment)
    {
        String sql = "insert into appointment values(" + appointment.getCustomerID() + ", " + appointment.getActivityID() + ", " + appointment.getAnimatorID() + ", '"
                + appointment.getDate() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void removeAppointment(Appointment appointment){
        String sql = "delete from appointment where customerID = " + appointment.getCustomerID() + "and activityID = "
                + appointment.getActivityID() + "and animatorID = " + appointment.getAnimatorID() + "and dateAndHour = '"
                + appointment.getDate() + "';";

        DbContext.ExecuteQuery(sql);

    }
}
