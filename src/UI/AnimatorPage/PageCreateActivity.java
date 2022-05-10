package UI.AnimatorPage;

import Business.Model.Activity.IndividualActivity;
import Business.Model.Activity.MassActivity;
import Business.ModelManager.ActivityManager;
import DB.DAO.ActivityDAO;
import UI.Page;
import UI.PageEntry;
import UI.Print;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PageCreateActivity extends Page {
	private JTextField activityDate = new JTextField("yyyy-mm-dd");
	private JTextField activityHour = new JTextField("hh-mm-ss");
	private JLabel iLabel = new JLabel("Individual Activity");
	private JTextField iNameTextField = new JTextField("Name");
	private JTextField iInternetLinkTextField = new JTextField("Internet Link");
	private JTextField iAgeRequirement = new JTextField("Age Requirement");
	private JButton iSubmitButton = new JButton("Submit");
	private JLabel mLabel = new JLabel("Mass Activity");
	private JTextField mNameTextField = new JTextField("Name");
	private JTextField mInternetLinkTextField = new JTextField("Internet Link");
	private JTextField mCapacityInput = new JTextField("Capacity Input");
	private JButton mSubmitButton = new JButton("Submit");
	private JButton returnToEntryPageButton = new JButton("Return");
	private JTextField mActivitiyType = new JTextField("Type");

	private ActivityDAO activityDAO = new ActivityDAO();
	private ActivityManager activityManager = new ActivityManager(activityDAO);

	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		activityDate.setBounds(50,52,300,50);
		activityHour.setBounds(450,52,300,50);
		iLabel.setBounds(50,102,300,50);
		iNameTextField.setBounds(50,168,300,50);
		iInternetLinkTextField.setBounds(50,234,300,50);
		iAgeRequirement.setBounds(50,300,300,50);
		iSubmitButton.setBounds(150,436,100,50);
		mLabel.setBounds(450,102,300,50);
		mNameTextField.setBounds(450,168,300,50);
		mInternetLinkTextField.setBounds(450,234,300,50);
		mCapacityInput.setBounds(450,300,300,50);
		mSubmitButton.setBounds(550,436,100,50);
		mActivitiyType.setBounds(450,366,300,50);
		returnToEntryPageButton.setBounds(350,488,100,50);
		
		iSubmitButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Individual submit button is clicked.");
				 activityManager.addIndividualActivity(new IndividualActivity(iNameTextField.getText(),iInternetLinkTextField.getText(),
						 activityDate.getText(),activityHour.getText(), SessionInformation.animatorID,iAgeRequirement.getText()));
		    }
		});
		
		mSubmitButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Mass submit button is clicked.");
				 activityManager.addMassActivity(new MassActivity(mNameTextField.getText(), mInternetLinkTextField.getText(),
						 activityDate.getText(), activityHour.getText(), SessionInformation.animatorID, mActivitiyType.getText(), mCapacityInput.getText()));
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(iLabel);
		components.add(iNameTextField);
		components.add(iInternetLinkTextField);
		components.add(iAgeRequirement);
		components.add(iSubmitButton);
		components.add(mLabel);
		components.add(mNameTextField);
		components.add(mInternetLinkTextField);
		components.add(mCapacityInput);
		components.add(mSubmitButton);
		components.add(returnToEntryPageButton);
		components.add(activityDate);
		components.add(activityHour);
		components.add(mActivitiyType);
	}
}
