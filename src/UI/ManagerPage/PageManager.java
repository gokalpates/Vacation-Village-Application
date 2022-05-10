package UI.ManagerPage;

import UI.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PageManager extends Page {
	private JButton addCustomerButton = new JButton("Add Customer");
	private JButton addAnimatorButton = new JButton("Add Animator");
	private JButton addEquipPersonButton = new JButton("Add Equip Person");
	private JButton returnToEntryPageButton = new JButton("Return");
	
	//Links
	public PageEntry entryPage = null;
	public PageAddEquipPerson addEquipPersonPage = null;
	public PageAddAnimator addAnimatorPage = null;
	public PageAddCustomer addCustomerPage = null;
	
	@Override
	public void startup()
	{
		addCustomerButton.setBounds(300, 120, 200, 100);
		addAnimatorButton.setBounds(300,250,200,100);
		addEquipPersonButton.setBounds(300, 380, 200, 100);
		returnToEntryPageButton.setBounds(350, 510, 100, 50);
		
		addCustomerButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add customer button is clicked.");
				 frame.clear();
				 frame.display(addCustomerPage);
		    }  
		});
		
		addAnimatorButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add animator button is clicked.");
				 frame.clear();
				 frame.display(addAnimatorPage);
		    }  
		});
		
		addEquipPersonButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add equip person button is clicked.");
				 frame.clear();
				 frame.display(addEquipPersonPage);
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(addCustomerButton);
		components.add(addAnimatorButton);
		components.add(addEquipPersonButton);
		components.add(returnToEntryPageButton);
	}
}
