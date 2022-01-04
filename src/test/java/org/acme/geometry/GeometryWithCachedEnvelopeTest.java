package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryWithCachedEnvelopeTest {

	public static final double EPSILON = 1.0e-15;

	public static Point createPointO() {
		return new Point(new Coordinate(0.0, 0.0));
	}

	public static Point createPointA() {
		return new Point(new Coordinate(1.0, 1.0));
	}

	@Test
	public void getEnvelopeMethod() {

		Geometry g = createPointA();
		// décoration
		g = new GeometryWithCachedEnvelope(g);
		Envelope a = g.getEnvelope() ; // calcul et stockage dans cachedEnvelope
		Envelope b = g.getEnvelope() ; // renvoi de cachedEnvelope
		Assert.assertSame(a, b);
	}
}
