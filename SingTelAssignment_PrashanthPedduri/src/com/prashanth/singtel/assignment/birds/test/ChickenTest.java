/**
 * 
 */
package com.prashanth.singtel.assignment.birds.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.prashanth.singtel.assignment.birds.Chicken;
import com.prashanth.singtel.assignment.util.Gender;

/**
 * @author ppedduri
 *
 */
public class ChickenTest
{

	private static Chicken rooster;
	private static Chicken chicken;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		chicken = new Chicken(Gender.FEMALE);
		rooster = new Chicken(Gender.MALE);
	}

	@Test
	public void testFly()
	{
		assertNotNull(chicken.fly());
		assertNull(chicken.fly());
	}
	
	@Test
	public void testNamesByGender()
	{
		assertEquals("Chicken", chicken.toString());
		assertEquals("Rooster", rooster.toString());
		assertNotEquals("Chicken", rooster.toString());
		assertNotEquals("Rooster", chicken.toString());
	}

	@Test
	public void testSpeak()
	{
		assertEquals("Cluck, Cluck", chicken.speak());
		assertEquals("Cock-a-doodle-doo", rooster.speak());
		assertNotEquals("Cluck, Cluck", rooster.speak());
		assertNotEquals("Cock-a-doodle-doo", chicken.speak());
	}
}
