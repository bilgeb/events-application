package com.bb.events.app.evts.controller;

import com.bb.events.app.evts.model.weather.WeatherSum;
import com.bb.events.app.evts.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bilge on 21/03/17.
 */
@Controller
@DependsOn("weatherService")
public class WeatherController {

    private static Logger LOGGER = LoggerFactory.getLogger(WeatherController.class);

    @Autowired
    private WeatherService weatherService;

    @RequestMapping(value = URIConstants.GET_WEATHER, method = RequestMethod.GET)
    public @ResponseBody
    WeatherSum getWeather(@PathVariable("city") String city) {
        LOGGER.info("Start get weather forecast.");
        return weatherService.getWeatherByName(city);
    }

}
