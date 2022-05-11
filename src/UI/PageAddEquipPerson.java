package UI;

import Business.Model.User.EquipPerson;
import Business.ModelManager.EquipPersonManager;
import DB.EquipPersonDAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageAddEquipPerson extends Page {
	private  JTextField idTextField = new JTextField("ID");
	private JTextField ssnTextField = new JTextField("SSN");
	private JTextField nameTextField = new JTextField("Name");
	private JTextField surnameTextField = new JTextField("Surname");
	private JTextField contactPhoneTextField = new JTextField("Contact Phone");
	private JButton addButton = new JButton("Add");
	private JButton returnToEntryPageButton = new JButton("Return");

	private JLabel message = new JLabel("");

	private EquipPersonDAO equipPersonDAO = new EquipPersonDAO();
	private EquipPersonManager equipPersonManager = new EquipPersonManager(equipPersonDAO);

	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		idTextField.setBounds(250,17,300,50);
		ssnTextField.setBounds(250,104,300,50);
		nameTextField.setBounds(250,191,300,50);
		surnameTextField.setBounds(250,278,300,50);
		contactPhoneTextField.setBounds(250,365,300,50);
		addButton.setBounds(350,422,100,50);
		returnToEntryPageButton.setBounds(350,503,100,50);
		message.setBounds(170,422,200,50);

		addButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add button is clicked.");
				 equipPersonManager.addEquipPerson(new EquipPerson(Integer.parseInt(idTextField.getText()),ssnTextField.getText(),
						 nameTextField.getText(),ssnTextField.getText(), contactPhoneTextField.getText()));
				 message.setForeground(Color.GREEN);
				 message.setText("Successfully added equip person");
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

		components.add(idTextField);
		components.add(ssnTextField);
		components.add(nameTextField);
		components.add(surnameTextField);
		components.add(contactPhoneTextField);
		components.add(addButton);
		components.add(returnToEntryPageButton);
		components.add(message);
	}
}
