package stoplight;


import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import mvc.*;



public class StopLightPanel extends AppPanel{
	private JButton change;
	public StopLightPanel(AppFactory factory) {
		super(factory);
		StopLightView view = new StopLightView((StopLight)model);
		add(view); // was addView before
		this.setLayout(new GridLayout(1, 2));
		//this.setLayout(new BorderLayout());
		change = new JButton("Change");
		change.addActionListener(this);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(change);
		add(buttonPanel, "West");
		add(view, "East");
		
	}
	public static void main(String[] args) {
		AppFactory factory = new StopLightFactory();
		AppPanel panel = new StopLightPanel(factory);
		panel.display();
	}
}
