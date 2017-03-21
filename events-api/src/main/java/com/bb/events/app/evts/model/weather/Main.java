package com.bb.events.app.evts.model.weather;

/**
 * Created by bilge on 21/03/17.
 */
public class Main {

    private final Float temp;
    private final Float temp_min;
    private final Float temp_max;
    private final Float pressure;
    private final Float sea_level;
    private final Float grnd_level;
    private final Float humidity;
    private final Float temp_kf;

    public Main(Float temp, Float temp_min, Float temp_max, Float pressure, Float sea_level, Float grnd_level, Float humidity, Float temp_kf) {
        this.temp = temp;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
        this.humidity = humidity;
        this.temp_kf = temp_kf;
    }

    public float getTemp() {
        return temp;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public float getPressure() {
        return pressure;
    }

    public float getSea_level() {
        return sea_level;
    }

    public float getGrnd_level() {
        return grnd_level;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemp_kf() {
        return temp_kf;
    }
}

