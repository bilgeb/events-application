package com.bb.events.app.evts.config;

import com.bb.events.app.evts.model.Event;
import com.bb.events.app.evts.model.Search;
import com.bb.events.app.evts.util.IntegerConverter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.NamedMapConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;

/**
 * Created by bilge on 21/03/17.
 */

@Configuration
@Import({JettyConfig.class})
@ComponentScan(
        basePackages = {"com.bb.events.app"},
        excludeFilters = {
                @ComponentScan.Filter(Controller.class),
                @ComponentScan.Filter(Configuration.class)})
public class RootConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public XStream xStream(){
        XStream xStream = new XStream();
        xStream.registerConverter(new NamedMapConverter(xStream.getMapper(), "entry", "key", String.class, "value", String.class ));
        xStream.processAnnotations(Search.class);
        xStream.registerConverter(new IntegerConverter());

        return xStream;
    }


}
