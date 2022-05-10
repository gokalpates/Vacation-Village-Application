package UI.CustomerPage;

import Business.ModelManager.CustomerManager;
import DB.DAO.CustomerDAO;
import UI.CustomerPage.PageCustomerAppointment;
import UI.Page;
import UI.PageEntry;
import UI.Print;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageCustomerLogin extends Page {
	private JTextField phoneNumberTextField = new JTextField("Phone Number");
	private JTextField passwordTextField = new JPasswordField("Password");
	private JButton loginButton = new JButton("Login");
	private JButton returnToEntryPageButton = new JButton("Return");

	private CustomerDAO customerDAO = new CustomerDAO();
	private CustomerManager customerManager = new CustomerManager(customerDAO);
	
	//Links
	public PageEntry entryPage = null;
	public PageCustomerAppointment customerAppointmentPage = null;
	
	@Override
	public void startup()
	{
		phoneNumberTextField.setBounds(250,110,300,50);
		passwordTextField.setBounds(250,215,300,50);
		loginButton.setBounds(350,320,100,50);
		returnToEntryPageButton.setBounds(350,400,100,50);
		
		loginButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Login button is clicked.");
				 if(customerManager.authenticateCustomer(phoneNumberTextField.getText(),passwordTextField.getText())){
					 SessionInformation.customerID = customerDAO.getIDFromPhoneNumber(phoneNumberTextField.getText());
					 frame.clear();
					 frame.display(customerAppointmentPage);
				 }
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(phoneNumberTextField);
		components.add(passwordTextField);
		components.add(loginButton);
		components.add(returnToEntryPageButton);
	}
}
