package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageEntry extends Page {
	private JButton managerLoginButton = new JButton("Manager Login");
	private JButton customerLoginButton = new JButton("Customer Login");
	private JButton animatorLoginButton = new JButton("Animator Login");
	
	//Links
	public PageManager managerPage = null;
	public PageCustomerLogin customerLoginPage = null;
	public PageAnimatorLogin animatorLoginPage = null;
	
	@Override
	public void startup()
	{
		managerLoginButton.setBounds(300, 120, 200, 100);
		customerLoginButton.setBounds(300,250,200,100);
		animatorLoginButton.setBounds(300, 380, 200, 100);
		
		managerLoginButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Manager login button is clicked.");
				 frame.clear();
				 frame.display(managerPage);
		    }  
		});
		
		customerLoginButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Customer login button is clicked.");
				 frame.clear();
				 frame.display(customerLoginPage);
		    }  
		});
		
		animatorLoginButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Animator login button is clicked.");
				 frame.clear();
				 frame.display(animatorLoginPage);
		    }  
		});
		
		components.add(managerLoginButton);
		components.add(customerLoginButton);
		components.add(animatorLoginButton);
	}
}
