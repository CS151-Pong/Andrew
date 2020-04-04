package mvc;


public abstract class Model extends Bean {

	private String filename= null;
	private boolean unsavedChanges = false;
	
//	private List<PropertyChangeListener> listeners = new ArrayList<>();
//	// <<interface>> PropertyChangeListener. 
//	// Model points to <<I>>PropertyChangeListener.

	public boolean hasUnsavedChanges() {
		// TODO Auto-generated method stub
		return unsavedChanges;
	}

	public String getFileName() {
		// TODO Auto-generated method stub
		return filename;
	}

	public void setUnsavedChanges(boolean b) {
		// TODO Auto-generated method stub
		this.unsavedChanges = b;
	}
	
	public Boolean getUnsavedChanges() {
		return unsavedChanges;
	}
	
	public void setFileName(String fName) {
		// TODO Auto-generated method stub
		this.filename = fName;
	}

//	public void removePropertyChangeListener(AppPanel appPanel) {
//		// TODO Auto-generated method stub
//		.remove(appPanel);
//	}
//
//	public void addPropertyChangeListener(AppPanel appPanel) {
//		// TODO Auto-generated method stub
//		listeners.add(appPanel);
//	}
	public void changed() {
		unsavedChanges = true;
		//setUnsavedChanges(true);
		firePropertyChange(null,null,null);
	}
	public void copy(Model other) {
		this.filename = other.filename;
		this.unsavedChanges = other.unsavedChanges;
	}
}
