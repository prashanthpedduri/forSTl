/**
 * 
 */
package com.prashanth.singtel.assignment.fishes;

import com.prashanth.singtel.assignment.basics.Animal;
import com.prashanth.singtel.assignment.basics.CanSwim;

/**
 * @author ppedduri
 *
 */
public class Fish extends Animal implements CanSwim
{
	//length of fish in feet
	private double lengthInFeet;
	
	//color of the fish
	private String color;
	
	@Override
	public String swim()
	{
		return "Fish Swimming";
	}

	@Override
	public String move()
	{
		return swim();
	}
	
	public double getLengthInFeet()
	{
		return lengthInFeet;
	}
	
	public void setLengthInFeet(double lengthInFeet)
	{
		this.lengthInFeet = lengthInFeet;
	}
	
	public String getColor()
	{
		return color;
	}
	
	@Override
	public String toString()
	{
		return "Fish";
	}
	
}
