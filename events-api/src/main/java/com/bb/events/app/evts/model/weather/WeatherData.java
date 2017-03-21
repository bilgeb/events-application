package com.bb.events.app.evts.model.weather;

import com.bb.events.app.evts.util.Ignore;

import java.util.List;

/**
 * Created by bilge on 21/03/17.
 */
public class WeatherData {

    private final Coord coord;
    private final List<Weather> weather;
    private final String base;
    private final Main main;
    private final float visibility;
    private final String wind;
    private final String rain;
    private final String clouds;

    private final String dt_txt;

    @Ignore
    private final Object sys;

    public WeatherData(Coord coord, List<Weather> weather, String base, Main main, float visibility, String wind, String rain, String clouds, String dt_txt, Object sys) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.rain = rain;
        this.clouds = clouds;
        this.dt_txt = dt_txt;
        this.sys = sys;
    }

    public Main getMain() {
        return main;
    }

    public List<Weather> getWeather() {
        return weather;
    }
}
