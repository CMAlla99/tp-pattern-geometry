package org.acme.geometry;

public abstract class AbstractGeometry implements Geometry {

    public abstract String asText();

    @Override
    public abstract Geometry clone();
}
