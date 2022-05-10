package UI.AnimatorPage;

import Business.ModelManager.AnimatorManager;
import DB.DAO.AnimatorDAO;
import UI.Page;
import UI.PageEntry;
import UI.Print;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageAnimatorLogin extends Page {
	private JTextField phoneNumberTextField = new JTextField("Phone Number");
	private JTextField passwordTextField = new JPasswordField("Password");
	private JButton loginButton = new JButton("Login");
	private JButton returnToEntryPageButton = new JButton("Return");

	private AnimatorDAO animatorDAO = new AnimatorDAO();
	private AnimatorManager animatorManager = new AnimatorManager(animatorDAO);
	
	//Links
	public PageEntry entryPage = null;
	public PageAnimator animatorPage = null;
	
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
				 if(animatorManager.authenticateAnimator(phoneNumberTextField.getText(), passwordTextField.getText())) {
					 SessionInformation.animatorID = animatorDAO.getIDFromPhoneNumber(phoneNumberTextField.getText());
					 frame.clear();
					 frame.display(animatorPage);
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
