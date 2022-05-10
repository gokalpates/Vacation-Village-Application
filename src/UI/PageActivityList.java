package UI;

import Business.ModelManager.ActivityManager;
import DB.DAO.ActivityDAO;
import UI.AnimatorPage.PageDeleteActivity;
import UI.CustomerPage.PageCustomerAppointment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PageActivityList extends Page {
	private JLabel currentActivitiesLabel = new JLabel("Current Activities");
	private JTextArea currentActivitiesTextArea = new JTextArea();
	private JButton currentActivitiesRefreshButton = new JButton("Refresh");
	private JButton returnToCallerPage = new JButton("Return");
	private int callerId = 0;

	private ActivityManager activityManager = new ActivityManager(new ActivityDAO());
	
	//Links
	public PageCustomerAppointment customerAppointmentPage = null;
	public PageDeleteActivity deleteActivityPage = null;
	
	@Override
	public void startup()
	{
		currentActivitiesLabel.setBounds(250,47,300,50);
		currentActivitiesTextArea.setBounds(50,150,700,300);
		currentActivitiesRefreshButton.setBounds(450,476,100,50);
		returnToCallerPage.setBounds(250,476,100,50);
		
		currentActivitiesRefreshButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Current activities refresh button is clicked.");
				 
				 String currentActivities = activityManager.getActivityInfo();
				 currentActivitiesTextArea.setText(currentActivities);
		    }  
		});
		
		returnToCallerPage.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to caller button is clicked.");
				 if(callerId == 0)
				 {
					 frame.clear();
					 frame.display(customerAppointmentPage);
				 }
				 else
				 {
					 frame.clear();
					 frame.display(deleteActivityPage);
				 }
		    }  
		});
		
		components.add(currentActivitiesLabel);
		components.add(currentActivitiesTextArea);
		components.add(currentActivitiesRefreshButton);
		components.add(returnToCallerPage);
	}
	
	public void setCaller(int callerId)
	{
		this.callerId = callerId;
	}
}
