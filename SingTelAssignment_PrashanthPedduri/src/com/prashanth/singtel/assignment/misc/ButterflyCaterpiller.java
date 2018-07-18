/**
 * 
 */
package com.prashanth.singtel.assignment.misc;

import com.prashanth.singtel.assignment.basics.Animal;
import com.prashanth.singtel.assignment.basics.CanFly;
import com.prashanth.singtel.assignment.basics.CanSpeak;
import com.prashanth.singtel.assignment.basics.CanWalk;
import com.prashanth.singtel.assignment.util.MetamorphosisStage;

/**
 * Following State (Bahavioural) Pattern,
 * Desiging the class ButterflyCaterpilar which serves the need 
 * of Both these stages, i.e. Caterpillar & Butterfly.
 * 
 * @author ppedduri
 */
public class ButterflyCaterpiller extends Animal implements CanFly, CanSpeak, CanWalk
{
	// Metamorphosis Stage (Initializing it to Caterpillar.
	// This has to be changed to BUTTERFLY as the time goes by.
	private MetamorphosisStage metamorphosisStage = MetamorphosisStage.CATERPILLAR;

	@Override
	public String speak()
	{
		if (metamorphosisStage == MetamorphosisStage.CATERPILLAR)
		{
			return "Click, Click, Click";
		}
		return "No Speak";
	}

	@Override
	public String fly()
	{
		if (metamorphosisStage == MetamorphosisStage.BUTTERFLY)
		{
			return "Butterfly: Flying!";
		}
		return "No Fly";
	}

	@Override
	public String move()
	{
		if (metamorphosisStage == MetamorphosisStage.CATERPILLAR)
		{
			return walk();
		}
		else if (metamorphosisStage == MetamorphosisStage.BUTTERFLY)
		{
			return fly();
		}
		return null;
	}

	@Override
	public String walk()
	{
		return "Caterpiller crawling!!";
	}

}
