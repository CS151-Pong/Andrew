package mvc;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public abstract class View extends JComponent implements PropertyChangeListener{

	protected Model model;
	
	public View(Model model) {
		super();
		this.model = model;
		model.addPropertyChangeListener(this);
	}
	public Model getModel() {
		return model;
	}
	
	public void propertyChange(PropertyChangeEvent e){
		repaint();
		
	}

	public void setModel(Model model) {
		// TODO Auto-generated method stub
		if(this.model != null) { 
			this.model.removePropertyChangeListener(this);
		}
		this.model = model;
		if(model != null) {
			this.model.addPropertyChangeListener(this);
			repaint();
		}
	}

}
