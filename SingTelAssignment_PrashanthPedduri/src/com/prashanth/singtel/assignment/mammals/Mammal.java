/**
 * 
 */
package com.prashanth.singtel.assignment.mammals;

import com.prashanth.singtel.assignment.basics.Animal;
import com.prashanth.singtel.assignment.basics.CanSpeak;
import com.prashanth.singtel.assignment.basics.CanWalk;

/**
 * @author ppedduri
 *
 */
public abstract class Mammal extends Animal implements CanSpeak, CanWalk
{
	
	@Override
	public String walk()
	{
		return "I'm "+toString()+"and I'm walking";
	}
	
	@Override
	public String move()
	{
		//We can implement this based on surface condition too.
		//But for now, calling walk()
		return walk();
	}
}
