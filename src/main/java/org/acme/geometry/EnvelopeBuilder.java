package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EnvelopeBuilder implements GeometryVisitor {

    private List<Double> xVals;
    private List<Double> yVals;

    public EnvelopeBuilder() {

        this.xVals = new ArrayList<Double>();
        this.yVals = new ArrayList<Double>();
    }

    public List<Double> getxVals() {

        return this.xVals;
    }

    public List<Double> getyVals() {

        return this.yVals;
    }

    public void insert(Coordinate coordinate) {
        
        this.xVals.add(coordinate.getX());
        this.yVals.add(coordinate.getY());
    }

    public Envelope build() {

        double xmin = Collections.min(xVals);
        double xmax = Collections.max(xVals);

        double ymin = Collections.min(yVals);
        double ymax = Collections.max(yVals);

        Coordinate bottomLeft = new Coordinate(xmin, ymin);
        Coordinate topRight = new Coordinate(xmax, ymax);
        Envelope envelope = new Envelope(bottomLeft, topRight);

        return envelope;
    }

    @Override
    public void visit(Point point) {
         
        this.insert(point.getCoordinate());
    }

    @Override
    public void visit(LineString LineString) {

        for(int i=0; i < LineString.getNumPoints(); ++i) {
            this.insert(LineString.getPointN(i).getCoordinate());
        }
    }
}
