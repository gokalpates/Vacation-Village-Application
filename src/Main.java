import Business.ModelManager.ActivityManager;
import Business.ModelManager.AnimatorManager;
import Business.ModelManager.CustomerManager;
import DB.ActivityDAO;
import DB.AnimatorDAO;
import DB.CustomerDAO;
import DB.DbContext;
import UI.Application;

public class Main {
    public static void main(String args[]) {
        DbContext db = new DbContext();
        CustomerDAO customerDAO = new CustomerDAO();
        AnimatorDAO animatorDAO = new AnimatorDAO();
        CustomerManager customerManager = new CustomerManager(customerDAO);
        AnimatorManager animatorManager = new AnimatorManager(animatorDAO);
        ActivityDAO activityDAO = new ActivityDAO();
        ActivityManager activityManager = new ActivityManager(activityDAO);

        Application application = new Application();
        application.startup();
    }
}