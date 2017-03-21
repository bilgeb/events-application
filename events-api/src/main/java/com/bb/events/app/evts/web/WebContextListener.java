package com.bb.events.app.evts.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;

/**
 * Created by bilge on 21/03/17.
 */
public class WebContextListener implements ServletContextListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebContextListener.class);
    private WebApplicationInitializer initializers[];

    public WebContextListener(WebApplicationInitializer initializers[]) {
        this.initializers = initializers;
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LOGGER.info("context initalized: " + servletContextEvent);
        for (WebApplicationInitializer initializer: initializers) {
            try {
                initializer.onStartup(servletContextEvent.getServletContext());
            }
            catch (ServletException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
