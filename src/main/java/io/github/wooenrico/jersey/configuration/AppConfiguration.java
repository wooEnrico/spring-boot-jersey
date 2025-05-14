package io.github.wooenrico.jersey.configuration;

import io.github.wooenrico.jersey.filter.JerseyRequestFilter;
import io.github.wooenrico.jersey.filter.JerseyResponseFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public ResourceConfig resourceConfig() {
        return new ResourceConfig() {
            {
                register(JerseyRequestFilter.class);
                register(JerseyResponseFilter.class);
                packages("io.github.wooenrico.jersey.resource");
            }
        };
    }
}
