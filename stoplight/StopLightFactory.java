package stoplight;

import mvc.*;

public class StopLightFactory implements AppFactory {

	public Model makeModel() { return new StopLight(); }

	public String[] getEditCommands() {
		// TODO Auto-generated method stub
		return new String[] {"Change"};
	}
	
	public Command makeEditCommand(Model model, String type) {
		if (type == "Change")
			return new ChangeCommand(model);
		return null;
	}

	public String getTitle() { return "Stop Light Simulator"; }

	public String[] getHelp() {
		return new String[] {"Click Change to cycle through colors"};
	}

	public String about() {
		return "Stoplight Simulator version 1.0. Copyright 2020 by Cyberdellic Designs";
	}

	@Override
	public String getAbout() {
		// TODO Auto-generated method stub
		return "this is a stoplight";
	}

}