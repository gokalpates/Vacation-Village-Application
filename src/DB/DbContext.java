//This class handles the basic communications with the database

package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbContext {
    public DbContext() {
        System.out.println("Opened database successfully");
    }

    //Function that returns a db connection
    //This function is used to connect the db for any reason.
    //All connections must be closed after they are no longer used.
    private static Connection getConnection()
    {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection(DBCredentials.url,
                            DBCredentials.user, DBCredentials.password);
            c.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return c;
    }

    //Function to execute given sql query.
    //Function gets a db connection from the getConnection function and then through that
    //connection executes the query. After the query is executed the connection is closed.
    public static void ExecuteQuery(String sql){
        Connection connection = DbContext.getConnection();
        Statement stm = null;
        try {
            stm = connection.createStatement();
            stm.executeUpdate(sql);
            connection.commit();
            stm.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }

    //Function that returns a QueryResult for a select query.
    //After the ResultSet is proccessed or read the closeConnection method of the QueryResult should be called
    //to close the connection.
    public static QueryResult ExecuteSelectQuery(String sql){
        Connection connection = DbContext.getConnection();
        Statement stm;
        ResultSet resultSet = null;
        QueryResult queryResult = null;
        try {
            stm = connection.createStatement();
            resultSet = stm.executeQuery(sql);
            queryResult = new QueryResult(resultSet, connection);
            return queryResult;
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return queryResult;
    }
}