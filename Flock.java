package sims;

import simstation.*;

public class Flock extends Simulation {

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		Bird b;
		for (int i = 0; i<50; i++)
		{
			b = new Bird("Bird #" + i);
			this.addAgent(b);
		}
	}

}
