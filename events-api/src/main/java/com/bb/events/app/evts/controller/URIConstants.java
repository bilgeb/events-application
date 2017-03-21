package com.bb.events.app.evts.controller;

/**
 * Created by bilge on 21/03/17.
 */
public class URIConstants {

    public static final String GET_FORECAST_BY_NAME = "weather?q=%s&units=metric&APPID=%s";

    public static final String GET_EVENTS_BY_LOCATION = "events/search?app_key=%s&location=%s&date=%s";

    public static final String GET_EVENTS_BY_LAT_LON = "events/search?app_key=%s&where=%s&date=%s";

    public static final String GET_EVENTS_BY_CATEGORY = "events/search?app_key=%s&category=%s&date=%s";

    public static final String GET_CATEGORIES =  "categories/list";

    ////////////////////////////

    public static final String GET_WEATHER =  "weather/{city}";

    public static final String GET_EVENTS =  "events/{city}";


}
