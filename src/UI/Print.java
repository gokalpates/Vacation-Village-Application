package UI;

public class Print {

    static public void info(String message)
    {
        System.out.println("Info: " + message);
    }

    static public void warning(String message)
    {
        System.out.println("Warning: " + message);
    }

    static  public void error(String message)
    {
        System.out.println("Error: " + message);
        System.exit(-1);
    }
}