package stoplight;
import mvc.*;
import java.awt.Color;

import mvc.*;

public class StopLight extends Model {
	private Color color = Color.GREEN;
	
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	
	public void change() {
		if(color == Color.GREEN) {
			color = Color.YELLOW;
		}
		else if(color == Color.YELLOW) {
			color = Color.RED;
		}
		else if(color == Color.RED) {
			color = Color.GREEN;
		}
		changed();//From Model, sets changed flag
		// and fires changed event
		
		
	}

	public String toString() {
		return "Stoplight.color= " + color;
	}

}
