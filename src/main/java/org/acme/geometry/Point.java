package org.acme.geometry;

public class Point {

    private Coordinate coordinate;

    public Point() {
        this.coordinate = new Coordinate();
    }

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
