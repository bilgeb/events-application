package com.bb.events.app.evts.config;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.GenericWebApplicationContext;

import com.bb.events.app.evts.web.SpringServletInitializer;
import com.bb.events.app.evts.web.WebContextListener;

import java.io.IOException;

/**
 * Created by bilge on 21/03/17.
 */
@Configuration
public class JettyConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(JettyConfig.class);

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public WebAppContext webAppContext() throws IOException {
        LOGGER.info("In the webAppContext");

        WebAppContext ctx = new WebAppContext();
        ctx.setContextPath("/");
        ctx.setWar(new ClassPathResource("webapp").getURI().toString());

        ctx.setInitParameter("org.eclipse.jetty.servlet.Default.dirAllowed", "false");

        GenericWebApplicationContext webApplicationContext =
                new GenericWebApplicationContext();
        webApplicationContext.setParent(applicationContext);
        webApplicationContext.refresh();

        ctx.setParentLoaderPriority(true);

        ctx.addEventListener(new ContextLoaderListener(webApplicationContext));
        ctx.addEventListener(
                new WebContextListener(new WebApplicationInitializer[]{
                        new SpringServletInitializer()
                }));

        return ctx;
    }

    @Autowired
    private Environment environment;

    @Bean( destroyMethod = "stop")
    public Server server() throws Exception {

        LOGGER.info("Creating the server");

        /* Create the server. */
        Server server = new Server(environment.getProperty("jetty.port", Integer.class, 9765));

        server.setHandler(webAppContext());
        server.start();
        return server;
    }


}