package com.prashanth.singtel.assignment.birds;

import com.prashanth.singtel.assignment.util.Gender;

/**
 * @author ppedduri
 */
public class Chicken extends Bird
{
	// A Male Chicken is considered a Rooster.
	private Gender gender;

	public Chicken(Gender gender)
	{
		this.gender = gender;
	}

	@Override
	public String speak()
	{
		if (gender == Gender.MALE)
			return "Cock-a-doodle-doo";
		else if (gender == Gender.FEMALE)
			return "Cluck, Cluck";
		else
			return null;
	}

	@Override
	public String fly()
	{
		// Going by the assumption that Chicken's wings are chipped.
		if (gender == Gender.MALE)
		{
			return super.fly();
		}
		else
		{
			return "No Fly";
		}
	}

	@Override
	public String toString()
	{
		if (gender == Gender.MALE)
			return "Rooster";
		else if (gender == Gender.FEMALE)
			return "Chicken";
		else
			return super.toString();
	}
}
