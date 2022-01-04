package org.acme.geometry;

public interface Geometry {

    public String getType();
    public boolean isEmpty();
    public void translate(double dx, double dy);
    public Envelope getEnvelope();
    public Geometry clone();
}
