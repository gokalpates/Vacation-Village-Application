package DB;

import java.sql.Connection;
import java.sql.ResultSet;


//The result set and the connection of a select query.
//After the data in the result set is processed the closeConnection method should be called.
public class QueryResult {
    public ResultSet resultSet;
    private Connection connection;

    public QueryResult(ResultSet resultSet, Connection connection) {
        this.resultSet = resultSet;
        this.connection = connection;
    }

    public void closeConnection(){
        try{
            connection.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}
