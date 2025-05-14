package io.github.wooenrico.jersey.filter;

import jakarta.annotation.Priority;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;

import java.io.IOException;

@Priority(0)
public class JerseyRequestFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        System.out.println("Request: " + containerRequestContext.getUriInfo().getRequestUri());
    }
}
