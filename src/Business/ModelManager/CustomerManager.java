package Business.ModelManager;

import Business.Model.User.Customer;
import DB.DAO.CustomerDAO;

import java.util.Objects;

public class CustomerManager {
    private CustomerDAO customerDAO;

    public CustomerManager(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void addCustomer(Customer customer){
        customerDAO.addCustomer(customer);
    }

    public void removeCustomer(String customerID){
        customerDAO.removeCustomer(customerID);
    }

    public boolean authenticateCustomer(String phoneNumber, String password)
    {
        Integer ID = customerDAO.getIDFromPhoneNumber(phoneNumber);
        if(Objects.equals(password, customerDAO.getPassword(ID))){
            return true;
        }

        return false;
    }
}
