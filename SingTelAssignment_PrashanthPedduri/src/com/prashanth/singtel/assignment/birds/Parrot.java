/**
 * 
 */
package com.prashanth.singtel.assignment.birds;

import java.util.ArrayList;

import com.prashanth.singtel.assignment.basics.Animal;
import com.prashanth.singtel.assignment.basics.CanSpeak;

/**
 * @author ppedduri
 *
 */
public class Parrot extends Bird
{

	//Assuming Parrot lives with only one neighbour and not with things like cellphone etc.
	private Animal neighbour;
	//This influencer is added to address things like cellphone ringtone/frequent sounds that Parrot listens.
	private ArrayList<String> influencers;
	
	public Parrot(Animal neighbour)
	{
		this.neighbour = neighbour;
	}
	
	public Parrot(ArrayList<String> influencers)
	{
		this.influencers = influencers;
	}
	
	public Parrot()
	{
		
	}


	@Override
	public String speak()
	{
		if (null != neighbour && neighbour instanceof CanSpeak)
		{
			return ((CanSpeak) neighbour).speak();
		}
		else if (null != influencers && influencers.size() > 0)
		{
			return getInfluencersInReadableFormat();
		}
		else
		{
			return "Parrot makes some random sound!";
		}
	}

	@Override
	public String toString()
	{
		StringBuilder name = new StringBuilder("Parrot");
		if(null != neighbour)
		{
			name.append(" who lives with "+neighbour.toString());
		}
		else if(null != influencers && influencers.size() > 0)
		{
			name.append(" who is influenced by "+getInfluencersInReadableFormat());
		}
		
		return name.toString();
	}
	
	public String getInfluencersInReadableFormat()
	{
		StringBuilder readableInfluencers = new StringBuilder();
		for (String influencer : influencers)
		{
			readableInfluencers.append(influencer+",");
		}
		
		//Removing last comma before sending out.
		return readableInfluencers.substring(0, readableInfluencers.length()-1);
	}
}
