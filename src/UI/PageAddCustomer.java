package UI;

import Business.Model.User.Customer;
import Business.ModelManager.CustomerManager;
import DB.CustomerDAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageAddCustomer extends Page {
	private JTextField nameTextField = new JTextField("Name");
	private JTextField ageTextField = new JTextField("Age");
	private JTextField roomNumberTextField = new JTextField("Room Number");
	private JTextField contactPhoneTextField = new JTextField("Contact Phone");
	private JButton addButton = new JButton("Add");
	private JButton returnToEntryPageButton = new JButton("Return");

	private JLabel message = new JLabel("Hello there");
	private CustomerDAO customerDAO = new CustomerDAO();
	private CustomerManager customerManager = new CustomerManager(customerDAO);
	
	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		nameTextField.setBounds(250, 50, 300, 50);
		ageTextField.setBounds(250,126,300,50);
		roomNumberTextField.setBounds(250, 202, 300, 50);
		contactPhoneTextField.setBounds(250, 278, 300, 50);
		addButton.setBounds(350,430,100,50);
		returnToEntryPageButton.setBounds(350,506,100,50);
		message.setBounds(350,370,200,50);

		addButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add button is clicked.");
				 customerManager.addCustomer(new Customer(nameTextField.getText(), Integer.parseInt(ageTextField.getText()),
						 Integer.parseInt(roomNumberTextField.getText()), contactPhoneTextField.getText()));
				 message.setForeground(Color.GREEN);
				 message.setText("Successfully added customer");
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
				 message.setText("");
		    }  
		});
		
		components.add(nameTextField);
		components.add(ageTextField);
		components.add(roomNumberTextField);
		components.add(contactPhoneTextField);
		components.add(addButton);
		components.add(returnToEntryPageButton);
		components.add(message);
	}
}
