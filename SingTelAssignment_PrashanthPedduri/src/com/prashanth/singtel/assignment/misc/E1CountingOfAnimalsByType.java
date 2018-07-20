package com.prashanth.singtel.assignment.misc;

import java.util.ArrayList;
import java.util.HashMap;

import com.prashanth.singtel.assignment.basics.Animal;
import com.prashanth.singtel.assignment.basics.CanFly;
import com.prashanth.singtel.assignment.basics.CanSing;
import com.prashanth.singtel.assignment.basics.CanSwim;
import com.prashanth.singtel.assignment.basics.CanWalk;
import com.prashanth.singtel.assignment.birds.Chicken;
import com.prashanth.singtel.assignment.birds.Duck;
import com.prashanth.singtel.assignment.birds.Parrot;
import com.prashanth.singtel.assignment.fishes.ClownFish;
import com.prashanth.singtel.assignment.fishes.Dolphin;
import com.prashanth.singtel.assignment.fishes.Fish;
import com.prashanth.singtel.assignment.fishes.Shark;
import com.prashanth.singtel.assignment.mammals.Cat;
import com.prashanth.singtel.assignment.mammals.Dog;
import com.prashanth.singtel.assignment.mammals.Frog;
import com.prashanth.singtel.assignment.util.Gender;

/**
 * This is targeted to solve Question E1
 *
 * 1. Can you share the code to count:
 *   a. how many of these animals can fly?
 *   b. how many of these animals can walk? 
 *   c. how many of these animals can sing? 
 *   d. how many of these animals can swim?
 *   
 * @author ppedduri
 *
 */
public class E1CountingOfAnimalsByType
{

	public static void main(String[] args)
	{
		Animal[] animals = new Animal[]{ 
				//new Bird(), // Removed: This should be an abstract class as it doesn't exist as a separate entity (just like Human as a class)
		        new Duck(),
		        new Chicken(Gender.MALE),
		        //new Rooster(), // Removed:  Rooster is a Male Chicken, no need of a separate class
		        new Parrot(),
		        new Fish(),
		        new Shark(),
		        new ClownFish(),
		        new Dolphin(),
		        new Frog(),
		        new Dog(),
		        new ButterflyCaterpiller(),
		        new Cat()
		};

		HashMap<Class<?>, ArrayList<Animal>> countOfEachCategory = new HashMap<Class<?>, ArrayList<Animal>>();
		
		//Initialize countOfEachCategory Map.
		countOfEachCategory.put(CanFly.class, new ArrayList<Animal>());
		countOfEachCategory.put(CanWalk.class, new ArrayList<Animal>());
		countOfEachCategory.put(CanSing.class, new ArrayList<Animal>());
		countOfEachCategory.put(CanSwim.class, new ArrayList<Animal>());
		
		//Form the Map in such a way that, it stores each category object by its Interface.
		for (Animal animal : animals)
		{
			if(animal instanceof CanFly)
				countOfEachCategory.get(CanFly.class).add(animal);
			if(animal instanceof CanWalk)
				countOfEachCategory.get(CanWalk.class).add(animal);
			if(animal instanceof CanSing)
				countOfEachCategory.get(CanSing.class).add(animal);
			if(animal instanceof CanSwim)
				countOfEachCategory.get(CanSwim.class).add(animal);
		}
		
		System.out.println("Count of CanFly is : "+countOfEachCategory.get(CanFly.class).size());
		System.out.println("Count of CanWalk is : "+countOfEachCategory.get(CanWalk.class).size());
		System.out.println("Count of CanSing is : "+countOfEachCategory.get(CanSing.class).size());
		System.out.println("Count of CanSwim is : "+countOfEachCategory.get(CanSwim.class).size());
		
	}

}
