package UI.AnimatorPage;

import Business.Model.EmergencyInformation;
import DB.DAO.EmergencyInformationDAO;
import UI.Page;
import UI.PageEntry;
import UI.Print;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PageAddEmergencyInfo extends Page {
	private JTextField activityIDTextField = new JTextField("Activity ID");
	private JTextField lockerNumberTextField = new JTextField("Locker Number");
	private JTextField phoneNumberTextField = new JTextField("Phone Number");
	private JButton addButton = new JButton("Add");
	private JButton returnToEntryPageButton = new JButton("Return");

	private EmergencyInformationDAO emergencyInformationDAO = new EmergencyInformationDAO();
	
	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		activityIDTextField.setBounds(250,71,300,50);
		lockerNumberTextField.setBounds(250,143,300,50);
		phoneNumberTextField.setBounds(250,215,300,50);
		addButton.setBounds(350,342,100,50);
		returnToEntryPageButton.setBounds(350,414,100,50);
		
		addButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add button is clicked.");
				 emergencyInformationDAO.addEmergencyInformation(new EmergencyInformation(Integer.parseInt(activityIDTextField.getText()),
						 phoneNumberTextField.getText(), Integer.parseInt(lockerNumberTextField.getText())));
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(activityIDTextField);
		components.add(lockerNumberTextField);
		components.add(phoneNumberTextField);
		components.add(addButton);
		components.add(returnToEntryPageButton);
	}
}
