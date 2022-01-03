package org.acme.geometry;

public class Point implements Geometry {

    private Coordinate coordinate;

    public Point() {
        this.coordinate = new Coordinate();
    }

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        
        return this. coordinate;
    }

    @Override
    public String getType() {
  
        return "Point";
    }

    @Override
    public boolean isEmpty() {
        return coordinate.isEmpty();
    }

    @Override
    public void translate(double dx, double dy) {

        coordinate.setX(coordinate.getX() + dx);
        coordinate.setY(coordinate.getY() + dy);
    }
}
