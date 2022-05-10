package UI.AnimatorPage;

import UI.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PageAnimator extends Page {
	private JButton deleteActivityButton = new JButton("Delete Activity");
	private JButton createActivityButton = new JButton("Create Activity");
	private JButton addEmergencyInfoButton = new JButton("Add Emergency Info");
	private JButton addEquipmentButton = new JButton("Add Equipment");
	private JButton returnToEntryPageButton = new JButton("Return");
	
	//Links
	public PageEntry entryPage = null;
	public PageDeleteActivity deleteActivityPage = null;
	public PageCreateActivity createActivityPage = null;
	public PageAddEmergencyInfo addEmergencyInfoPage = null;
	public PageAddEquipment addEquipmentPage = null;
	
	@Override
	public void startup()
	{
		deleteActivityButton.setBounds(300,0,200,100);
		createActivityButton.setBounds(300, 120, 200, 100);
		addEmergencyInfoButton.setBounds(300,250,200,100);
		addEquipmentButton.setBounds(300, 380, 200, 100);
		returnToEntryPageButton.setBounds(350, 510, 100, 50);
		
		deleteActivityButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Delete activity button is clicked.");
				 frame.clear();
				 frame.display(deleteActivityPage);
		    }  
		});
		
		createActivityButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Create activity button is clicked.");
				 frame.clear();
				 frame.display(createActivityPage);
		    }  
		});
		
		addEmergencyInfoButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add emergency info button is clicked.");
				 frame.clear();
				 frame.display(addEmergencyInfoPage);
		    }  
		});
		
		addEquipmentButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add equipment button is clicked.");
				 frame.clear();
				 frame.display(addEquipmentPage);
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(deleteActivityButton);
		components.add(createActivityButton);
		components.add(addEmergencyInfoButton);
		components.add(addEquipmentButton);
		components.add(returnToEntryPageButton);
	}
}
