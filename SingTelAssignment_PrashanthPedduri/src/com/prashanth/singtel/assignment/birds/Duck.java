package com.prashanth.singtel.assignment.birds;

import com.prashanth.singtel.assignment.basics.CanSwim;
import com.prashanth.singtel.assignment.util.SurfaceStatus;

/**
 * @author ppedduri
 *
 */
public class Duck extends Bird implements CanSwim
{

	private SurfaceStatus surfaceStatus;
	
	@Override
	public String speak()
	{
		return "Quak-Quak";
	}
	

	@Override
	public String swim()
	{
		return "Duck Swimming!";
	}


	@Override
	public String move()
	{
		if(surfaceStatus==SurfaceStatus.IN_WATER) {
			return swim();
		}
		else
			return super.move();
	}

	@Override
	public String toString()
	{
		return "Duck";
	}
}
