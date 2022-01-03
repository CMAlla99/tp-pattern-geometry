package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){

		Coordinate c = new Coordinate();
		Assert.assertEquals(Double.NaN, c.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, c.getY(), EPSILON);
	}

	@Test
	public void testConstructor(){

		Coordinate c = new Coordinate(1.0, 2.0);
		Assert.assertEquals(1.0, c.getX(), EPSILON);
		Assert.assertEquals(2.0, c.getY(), EPSILON);
	}

	@Test
	public void isEmptyMethod(){

		Coordinate c = new Coordinate();
		Assert.assertTrue(c.isEmpty());
	}

}
