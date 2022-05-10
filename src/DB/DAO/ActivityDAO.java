package DB.DAO;

import Business.Model.Activity.IndividualActivity;
import Business.Model.Activity.MassActivity;
import DB.DbContext;
import DB.QueryResult;

public class ActivityDAO {
    public void addIndividualActivity(IndividualActivity individualActivity){
        String sql = "call addIndActivity('" + individualActivity.getName() + "','" + individualActivity.getLink() +"','" +
                individualActivity.getDate() + "','" + individualActivity.getHour() + "'," + individualActivity.getAnimatorID() + ",'" +
                individualActivity.getAge() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void addMassActivity(MassActivity massActivity){
        String sql = "call addMassAct('" + massActivity.getName() + "','" + massActivity.getLink() +"','" +
                massActivity.getDate() + "','" + massActivity.getHour() + "'," + massActivity.getAnimatorID() + ",'" +
                massActivity.getType() + "','" + massActivity.getCapacity() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void updateMassActivityCapacity(String activityID, String newCapacity){
        String sql = "update massActivity set capacity = '" + newCapacity + "' where activityID = '" + activityID + "';";
        DbContext.ExecuteQuery(sql);
    }

    public QueryResult getActivityTypes(){
        String sql = "select activityType from massActivity";
        QueryResult queryResult;

        queryResult = DbContext.ExecuteSelectQuery(sql);
        return queryResult;
    }

    public QueryResult getActivityInfo(){
        String sql = "select name,date,hour from activity";
        QueryResult queryResult;

        queryResult = DbContext.ExecuteSelectQuery(sql);
        return queryResult;
    }

    public void deleteActivity(Integer ID){
        String sql = "delete from appointment where activityID = " + ID + ";";
        DbContext.ExecuteQuery(sql);

        sql = "delete from individualActivity where activityID = " + ID + ";";
        DbContext.ExecuteQuery(sql);

        sql = "delete from massActivity where activityID = " + ID + ";";
        DbContext.ExecuteQuery(sql);

        sql = "delete from activity where activityID = " + ID + ";";
        DbContext.ExecuteQuery(sql);
    }

    public QueryResult getMassActivityInfo(String date, String hour){
        String sql = "select activityID,animatorID from massActivityInfo where date = '" + date + "' and hour = '" + hour + "';";
        QueryResult queryResult;

        queryResult = DbContext.ExecuteSelectQuery(sql);
        return queryResult;
    }

    public QueryResult getIndActivityInfo(String date, String hour){
        String sql = "select activityID, animatorID from indActivityInfo where date = '" + date + "' and hour = '" + hour + "';";
        QueryResult queryResult;

        queryResult = DbContext.ExecuteSelectQuery(sql);
        return queryResult;
    }
}
