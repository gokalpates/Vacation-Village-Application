package UI.AnimatorPage;

import Business.Model.Equipment;
import DB.DAO.EquipmentDAO;
import UI.Page;
import UI.PageEntry;
import UI.Print;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PageAddEquipment extends Page {
	private JTextField equipPersonSSNTextField = new JTextField("Equip Person SSN");
	private JTextField nameTextField = new JTextField("Name");
	private JTextField purposeTextField = new JTextField("Purpose");
	private JButton addButton = new JButton("Add");
	private JButton returnToEntryPageButton = new JButton("Return");

	private EquipmentDAO equipmentDAO = new EquipmentDAO();
	
	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		equipPersonSSNTextField.setBounds(250,71,300,50);
		nameTextField.setBounds(250,143,300,50);
		purposeTextField.setBounds(250,215,300,50);
		addButton.setBounds(350,342,100,50);
		returnToEntryPageButton.setBounds(350,414,100,50);
		
		addButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add button is clicked.");
				 equipmentDAO.addEquipment(new Equipment(equipPersonSSNTextField.getText(), nameTextField.getText(),
						 purposeTextField.getText()));
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(equipPersonSSNTextField);
		components.add(nameTextField);
		components.add(purposeTextField);
		components.add(addButton);
		components.add(returnToEntryPageButton);
	}
}
