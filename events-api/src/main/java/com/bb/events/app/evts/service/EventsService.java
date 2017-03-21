package com.bb.events.app.evts.service;

import com.bb.events.app.evts.controller.URIConstants;
import com.bb.events.app.evts.model.Event;
import com.bb.events.app.evts.model.Search;
import com.bb.events.app.evts.util.HttpUtil;
import com.thoughtworks.xstream.XStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bilge on 21/03/17.
 */

@Service
@DependsOn("xStream")
public class EventsService {

    private final static String APPLICATION_KEY = "FWgqgHrZ8Brqw4kp";

    private final static String BASE_URL = "http://api.evdb.com/rest/";

    @Autowired
    private XStream xStream;

    public List<Event> getEvents(String city){

        final String url = BASE_URL + String.format(URIConstants.GET_EVENTS_BY_LOCATION, APPLICATION_KEY, city, "future");

        final Search result = (Search) HttpUtil.getURLAsXML(xStream, url);

        if(result != null ) {
            return result.getEvents();
        } return null;
    }

}
