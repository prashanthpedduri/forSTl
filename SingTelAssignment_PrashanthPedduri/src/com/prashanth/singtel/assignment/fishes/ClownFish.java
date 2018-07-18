package com.prashanth.singtel.assignment.fishes;

/**
 * 
 * @author ppedduri
 *
 */
public class ClownFish extends Fish
{
	// size in feet (considering avg size of any shark)
	// this can be modified anytime.
	private double avgLengthInFeet = 0.4;

	// color (can be changed)
	private String color = "white";

	public String makeJokes()
	{
		return "A clown Fish's ultimate joke";
	}
	
	@Override
	public String toString()
	{
		return "ClownFish";
	}
}
