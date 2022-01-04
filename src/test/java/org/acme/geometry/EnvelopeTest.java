package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){

		Envelope e = new Envelope();
		Assert.assertTrue(e.isEmpty());
	}

	@Test
	public void testConstructor(){

		Envelope e = new Envelope(new Coordinate(1.0, 1.0), new Coordinate(2.0, 2.0));
		Assert.assertFalse(e.isEmpty());
	}
}
