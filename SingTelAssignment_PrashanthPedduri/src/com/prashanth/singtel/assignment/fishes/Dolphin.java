package com.prashanth.singtel.assignment.fishes;

import com.prashanth.singtel.assignment.basics.Animal;
import com.prashanth.singtel.assignment.basics.CanSwim;

public class Dolphin extends Animal implements CanSwim
{

	@Override
	public String swim()
	{
		return "Dophin Swimming!";
	}

	@Override
	public String move()
	{
		return swim();
	}

	@Override
	public String toString()
	{
		return "Dolphin";
	}
}
