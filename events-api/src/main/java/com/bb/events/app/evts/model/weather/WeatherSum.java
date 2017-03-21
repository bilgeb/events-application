package com.bb.events.app.evts.model.weather;

/**
 * Created by bilge on 21/03/17.
 */
public class WeatherSum {

    private final Float temperature;
    private final String look;

    public WeatherSum(float temperature, String look) {
        this.temperature = temperature;
        this.look = look;
    }

    @Override
    public String toString() {
        return "WeatherSum{" +
                "temperature=" + temperature +
                ", look='" + look + '\'' +
                '}';
    }
}
