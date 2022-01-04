package org.acme.geometry;

//import java.util.ArrayList;
//import java.util.List;

public abstract class AbstractGeometry implements Geometry {

    //private List<GeometryListener> listener = new ArrayList<GeometryListener>();

    public String asText() {

        WktVisitor visitor = new WktVisitor();
		this.accept(visitor);
        return visitor.getResult();
    }

    @Override
    public abstract Geometry clone();

    @Override
    public Envelope getEnvelope() {

        EnvelopeBuilder builder = new EnvelopeBuilder();
        this.accept(builder);
        return builder.build();
    }

    @Override
    public void addListener(GeometryListener listener) {
    }

}
