package DB.DAO;

import Business.Model.User.Animator;
import DB.DbContext;
import DB.QueryResult;

public class AnimatorDAO {

    public void addAnimator(Animator animator){
        String sql = "insert into animator(name, phoneNum, expArea) values('" + animator.getName() + "','" +
                animator.getPhoneNum() + "','" + animator.getExpArea() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void removeAnimator(String animatorID){
        //delete animator password
        String sql = "delete from animatorPassword where animatorID = '" + animatorID + "';";
        DbContext.ExecuteQuery(sql);

        //delete equipment used by the animator
        sql = "delete from equipment where eSSN = '" + animatorID + "';";
        DbContext.ExecuteQuery(sql);

        //delete equip person
        sql = "delete from equip_person where empID = '" + animatorID + "';";
        DbContext.ExecuteQuery(sql);

        //delete animator's appointments
        sql = "delete from appointment where animatorID = '" + animatorID + "';";
        DbContext.ExecuteQuery(sql);

        //delete animator
        sql = "delete from animator where empID = '" + animatorID + "';";
        DbContext.ExecuteQuery(sql);
    }

    public String getPassword(Integer animatorID){
        QueryResult queryResult = null;
        String password = null;

        String sql = "select password from animatorPassword where animatorID = " + animatorID + ";";
        queryResult = DbContext.ExecuteSelectQuery(sql);

        try {
            while(queryResult.resultSet.next()) {
                password = queryResult.resultSet.getString("password");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        queryResult.closeConnection();
        return password;
    }

    public Integer getIDFromPhoneNumber(String phoneNumber){
        Integer ID = null;
        QueryResult queryResult = null;
        String sql = "select empID from animator where phoneNum = '" + phoneNumber + "';";
        queryResult = DbContext.ExecuteSelectQuery(sql);

        try{
            while (queryResult.resultSet.next()){
                ID = queryResult.resultSet.getInt("empID");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return ID;
    }
}
