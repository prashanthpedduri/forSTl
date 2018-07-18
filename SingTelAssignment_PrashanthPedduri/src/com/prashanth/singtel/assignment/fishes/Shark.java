package com.prashanth.singtel.assignment.fishes;

import java.util.ArrayList;

/**
 * @author ppedduri
 *
 */
public class Shark extends Fish
{
	//size in feet (considering avg size of any shark)
	//this can be modified anytime.
	private double avgLengthInFeet = 12; 
	
	//color (can not be changed)
	private final String color = "Grey";
	
	//eating style, we can keep adding here.
	private ArrayList<String> eatingHabits = new ArrayList<String>() {{add("Fish"); add("Human");}};
	
	public double getLengthInFeet()
	{
		return avgLengthInFeet;
	}
	
	@Override
	public String getColor()
	{
		return this.color;
	}
	
	public void setLengthInFeet(int avgLengthInFeet)
	{
		this.avgLengthInFeet = avgLengthInFeet;
	}
	
	public String getEatingHabits()
	{
		StringBuilder eatingHabitsStrBldr = new StringBuilder();
		for (String eatingHabit : eatingHabits)
		{
			eatingHabitsStrBldr.append(eatingHabit+",");
		}
		
		//Remove comma before returning
		return eatingHabitsStrBldr.substring(0, eatingHabitsStrBldr.length()-1);
	}

	@Override
	public String toString()
	{
		return "Shark";
	}
	
}
