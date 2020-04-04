package stoplight;

import mvc.*;

public class ChangeCommand extends Command {
	public ChangeCommand(Model model) {
		super(model);
	}
	public void execute() {
		StopLight light = (StopLight)model;
		light.change();
	}
}
