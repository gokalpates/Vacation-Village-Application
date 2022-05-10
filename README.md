In order to use this project add a DBCredentials.java file to DB package and add the code below:
````java
package DB;

public class DBCredentials {
    public static String url = "jdbc:postgresql://localhost:5432/database_name";
    public static String user = "username";
    public static String password = "password";
}
````
If you are runnig your Postgresql on another port or you don't have your db on local than change url accordingly