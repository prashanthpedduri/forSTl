package com.prashanth.singtel.assignment.birds;

import com.prashanth.singtel.assignment.basics.Animal;
import com.prashanth.singtel.assignment.basics.CanFly;
import com.prashanth.singtel.assignment.basics.CanSpeak;
import com.prashanth.singtel.assignment.basics.CanWalk;
import com.prashanth.singtel.assignment.util.SurfaceStatus;

/**
 * @author ppedduri
 *
 */
public abstract class Bird extends Animal implements CanSpeak, CanFly, CanWalk
{
	private SurfaceStatus surfaceStatus;
	@Override
	public String walk()
	{
		return "I'm "+toString()+"and I'm walking";
	}
	
	@Override
	public String fly()
	{
		return "I'm "+toString()+"and I'm flying";
	}

	@Override
	public String move()
	{
		// Based on the state or condition of environment.
		// E.g. if Bird is in Air, it flies. if its on ground, it walks.
		if (surfaceStatus == SurfaceStatus.IN_AIR)
			return fly();
		else if (surfaceStatus == SurfaceStatus.ON_GROUND)
			return walk();
		else
			return null;
	}
}
