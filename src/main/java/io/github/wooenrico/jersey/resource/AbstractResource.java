package io.github.wooenrico.jersey.resource;

import jakarta.ws.rs.container.ResourceContext;
import jakarta.ws.rs.core.Context;

public abstract class AbstractResource {

    @Context
    protected ResourceContext resourceContext;

    public <T> T getSubResource(Class<T> t) {
        return resourceContext.getResource(t);
    }
}
