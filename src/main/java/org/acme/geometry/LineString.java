package org.acme.geometry;

import java.util.List;

public class LineString implements Geometry {

    private List<Point> points;

    public LineString() {
    }

    public LineString(List<Point> points) {
        this.points = points;
    }

    public int getNumPoints() {
        return 0;
    }

    public Point getPointN(int n) {
        return new Point();
    }

    @Override
    public String getType() {

        return "LineString";
    }
}
