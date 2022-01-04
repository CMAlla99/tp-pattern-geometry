package org.acme.geometry;

public class Envelope {

    private Coordinate bottomLeft;
    private Coordinate topRight;

    public Envelope() {
        this.bottomLeft = new Coordinate();
        this.topRight = new Coordinate();
    }

    public Envelope(Coordinate bottomLeft, Coordinate topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public double getXmin() {
        
        return this.coordinate;
    }

    public boolean isEmpty() {
        return coordinate.isEmpty();
    }
}
