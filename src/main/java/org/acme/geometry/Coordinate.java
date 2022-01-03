package org.acme.geometry;

public class Coordinate {

    private final double x;
    private final double y;

    public Coordinate() {
        this.x = Double.NaN;
        this.y = Double.NaN;
    }

    public Coordinate(double x, double y) {
       this.x = x;
       this.y = y; 
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public boolean isEmpty() {

        if (x == Double.NaN) {
            return true;
        }
        if (y == Double.NaN) {
            return true;
        }
        return false;
    }
}
