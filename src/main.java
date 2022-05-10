import Business.Model.User.Animator;
import Business.Model.User.Customer;
import Business.ModelManager.ActivityManager;
import Business.ModelManager.AnimatorManager;
import Business.ModelManager.CustomerManager;
import DB.DAO.ActivityDAO;
import DB.DAO.AnimatorDAO;
import DB.DAO.CustomerDAO;
import DB.DbContext;
import UI.Application;

import java.util.Arrays;

public class main {
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

        String[] types = activityManager.getMassActivityTypes();

        System.out.println(Arrays.toString(types));
    }
}