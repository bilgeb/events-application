package com.bb.events.app.evts.model.weather;

/**
 * Created by bilge on 21/03/17.
 */
public class Coord {

    private final Float lon;
    private final Float lat;

    public Coord(Float lon, Float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public Float getLat() {
        return lat;
    }

}
