package io.github.wooenrico.jersey.resource;

import io.github.wooenrico.jersey.service.TestService;
import jakarta.inject.Inject;

public class ServiceResource extends AbstractResource {
    @Inject
    protected TestService testService;
}
