//This class handles the database queries that directly concern the customer model

package DB.DAO;

import Business.Model.User.Customer;
import DB.DbContext;
import DB.QueryResult;

public class CustomerDAO {
    public void addCustomer(Customer customer)
    {
        String sql = "insert into customer(name, age, roomNum, phone) values('" + customer.getName() + "', " + customer.getAge() + ", "
                + customer.getRoomNumber() + ", '" + customer.getPhoneNumber() + "');";
        DbContext.ExecuteQuery(sql);
    }


    //Function removes the customer with the given ID
    //First the customer password and appointments with the given customerID's are deleted then the customer itself is removed
    public void removeCustomer(String customerID){
        String sql = "delete from customerPassword where customerID = '" + customerID + "';";
        DbContext.ExecuteQuery(sql);
        sql = "delete from appointment where customerID = '" + customerID + "';";
        DbContext.ExecuteQuery(sql);
        sql = "delete from customer where customerID = '" + customerID + "';";
        DbContext.ExecuteQuery(sql);

    }

    public String getPassword(Integer customerID){
        QueryResult queryResult = null;
        String password = null;

        String sql = "select password from customerPassword where customerID = " + customerID + ";";
        queryResult = DbContext.ExecuteSelectQuery(sql);

        try {
            while(queryResult.resultSet.next()) {
                password = queryResult.resultSet.getString("password");
            }
            System.out.println(password);
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
        String sql = "select customerID from customer where phone = '" + phoneNumber + "';";
        queryResult = DbContext.ExecuteSelectQuery(sql);

        try{
            while (queryResult.resultSet.next()){
                ID = Integer.parseInt(queryResult.resultSet.getString("customerID"));
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
