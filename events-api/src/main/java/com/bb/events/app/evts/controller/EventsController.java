package com.bb.events.app.evts.controller;

import com.bb.events.app.evts.model.Event;
import com.bb.events.app.evts.service.EventsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by bilge on 21/03/17.
 */
@Controller
@DependsOn("eventsService")
public class EventsController {

    private static Logger LOGGER = LoggerFactory.getLogger(EventsController.class);

    @Autowired
    private EventsService eventsService;

    @RequestMapping(value = URIConstants.GET_EVENTS, method = RequestMethod.GET)
    public @ResponseBody List<Event> getEvents(@PathVariable("city") String city) {
        LOGGER.info("Start get cities list for weather forecast.");
        return eventsService.getEvents(city);
    }


}
