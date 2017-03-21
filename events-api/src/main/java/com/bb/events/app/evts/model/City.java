package com.bb.events.app.evts.model;

import com.bb.events.app.evts.model.weather.Coord;
import com.bb.events.app.evts.util.Ignore;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bilge on 21/03/17.
 */
public class City {
    @SerializedName(value="ID", alternate={"id", "_id"})
    private final int id;

    private final String name;
    private final Coord coord;
    private final String country;
    private final long population;

    @Ignore
    private final Object sys;

    public City(int id, String name, Coord coord, String country, long population, Object sys) {
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
        this.population = population;
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coord getCoord() {
        return coord;
    }

    public String getCountry() {
        return country;
    }

    public long getPopulation() {
        return population;
    }

}
