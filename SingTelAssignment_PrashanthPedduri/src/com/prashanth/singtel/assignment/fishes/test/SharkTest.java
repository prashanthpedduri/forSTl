/**
 * 
 */
package com.prashanth.singtel.assignment.fishes.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.prashanth.singtel.assignment.fishes.Shark;

/**
 * @author ppedduri
 *
 */
public class SharkTest
{

	private static Shark shark;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		shark = new Shark();
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testColor()
	{
		assertEquals("Grey", shark.getColor());
		assertNotEquals("Green", shark.getColor());
	}
	
	@Test
	public void testEat()
	{
		assertTrue(shark.getEatingHabits().contains("Fish"));
		assertFalse(shark.getEatingHabits().contains("Plants"));
	}

}
