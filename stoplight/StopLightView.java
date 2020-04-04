package stoplight;

import java.awt.Color;
import java.awt.Graphics;

import mvc.*;

public class StopLightView extends View {
	
	public StopLightView(StopLight light) {
		super(light);
		// TODO Auto-generated constructor stub
	}

	public void paintComponent(Graphics gc) {
		StopLight light = (StopLight)model;
		Color oldColor = gc.getColor();
		gc.setColor(light.getColor());
		gc.fillOval(100, 100, 20, 20);
		gc.setColor(oldColor);
	}

}
