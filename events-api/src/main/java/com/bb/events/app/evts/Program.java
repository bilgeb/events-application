package com.bb.events.app.evts;

import com.bb.events.app.evts.config.RootConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by bilge on 21/03/17.
 */
public class Program {

    private static Logger LOGGER = LoggerFactory.getLogger(Program.class);

    public static void main(String args[]) throws IOException {
        try {
            AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
            applicationContext.registerShutdownHook();
            applicationContext.register(RootConfig.class);
            applicationContext.refresh();
            LOGGER.info("Running.");
        } catch (Exception e) {
            LOGGER.error("Error starting application", e);
            System.exit(1);
        }
    }

}
