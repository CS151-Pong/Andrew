package sims;

import mvc.Model;
import simstation.*;

public class FlockFactory extends SimStationFactory {

	public FlockFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model makeModel() {
		return new FlockSimulation();
	}
}
