package com.prashanth.singtel.assignment.birds.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.prashanth.singtel.assignment.birds.Chicken;
import com.prashanth.singtel.assignment.birds.Parrot;
import com.prashanth.singtel.assignment.mammals.Dog;
import com.prashanth.singtel.assignment.mammals.Frog;
import com.prashanth.singtel.assignment.util.Gender;

/**
 * @author ppedduri
 *
 */
public class ParrotTest
{

	private static Parrot parrotWithDog;
	private static Parrot parrotWithChicken;
	private static Parrot parrotWithFrog;
	private static Parrot parrotWithCellPhoneInfluencer;
	private static Dog dog;
	private static Chicken chicken;
	private static Frog frog;
	private static ArrayList<String> influencers;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		dog = new Dog();
		chicken = new Chicken(Gender.FEMALE);
		frog = new Frog();
		influencers = new ArrayList<String>() {{add("beep beep"); add("tring tring");}};
		parrotWithDog = new Parrot(dog);
		parrotWithChicken = new Parrot(chicken);
		parrotWithFrog = new Parrot(frog);
		parrotWithCellPhoneInfluencer = new Parrot(influencers);
	}

	@Test
	public void testSpeakPositive()
	{
		assertEquals(dog.speak(), parrotWithDog.speak());
		assertEquals(chicken.speak(), parrotWithChicken.speak());
		assertEquals(frog.speak(), parrotWithFrog.speak());
		assertTrue(parrotWithCellPhoneInfluencer.speak().contains(influencers.get(0)));
	}
	
	@Test
	public void testSpeakNegative()
	{
		assertNotEquals(dog.speak(), parrotWithChicken.speak());
		assertNotEquals(chicken.speak(), parrotWithDog.speak());
		assertNotEquals(frog.speak(), parrotWithCellPhoneInfluencer.speak());
		assertFalse(parrotWithCellPhoneInfluencer.speak().contains("random stuff"));
	}

	@AfterClass
	public static void tearDown()
	{
		parrotWithDog = null;
		parrotWithChicken = null;
		parrotWithFrog = null;
		parrotWithCellPhoneInfluencer = null;
		dog = null;
		chicken = null;
		frog = null;
		influencers = null;
	}
}
