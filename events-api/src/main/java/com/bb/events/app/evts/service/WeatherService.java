package com.bb.events.app.evts.service;

import com.bb.events.app.evts.controller.URIConstants;
import com.bb.events.app.evts.model.weather.Response;
import com.bb.events.app.evts.model.weather.Weather;
import com.bb.events.app.evts.model.weather.WeatherData;
import com.bb.events.app.evts.model.weather.WeatherSum;
import com.bb.events.app.evts.util.HttpUtil;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bilge on 21/03/17.
 */

@Service
public class WeatherService {

    private final static String TOKEN = "664db99c03257b227d1b83a5eabdb121";

    private final static String URL = "http://api.openweathermap.org/data/2.5/";

    public static final String GET_FORECAST_BY_NAME = "forecast/weather?q=%s&&units=metric&APPID=%s";

    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherService.class);

    public WeatherSum getWeatherByName(String city)
    {
        final String url = URL + String.format(URIConstants.GET_FORECAST_BY_NAME, city ,TOKEN);

        Type type = new TypeToken<Response<List<WeatherData>>>() {}.getType();

        WeatherSum summary = null;

        Response<List<WeatherData>> response = (Response<List<WeatherData>>) HttpUtil.getURLAsJson(type, url);
        if( response !=null && !response.getList().isEmpty() )
        {
            List<WeatherData> temp = new ArrayList<WeatherData>();
            WeatherData weatherData = temp.get(0);
            Weather weather = weatherData.getWeather()!=null?weatherData.getWeather().get(0):null;

            if(weatherData.getMain()!=null && weather!=null) {
                summary = new WeatherSum(weatherData.getMain().getTemp(), weather.getDescription());
            }
        }

        return summary;
    }

}
