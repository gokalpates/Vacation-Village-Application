package UI;

import javax.swing.*;

public class Frame {
	
	private JFrame frame =  new JFrame("Frame");
	
	public void startup()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void shutdown()
	{
		
	}
	
	public void display(Page page)
	{
		for(int i = 0; i < page.getComponents().size(); i++)
		{
			frame.getContentPane().add(page.getComponents().get(i));
		}
		
		frame.getContentPane().validate();
		frame.getContentPane().repaint();
	}
	
	public void clear()
	{
		frame.getContentPane().removeAll();
		frame.getContentPane().validate();
		frame.getContentPane().repaint();
	}
}
