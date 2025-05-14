package io.github.wooenrico.jersey.resource.service;

import io.github.wooenrico.jersey.resource.ServiceResource;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class V1Resource extends ServiceResource {
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getV1() {
        return "Hello V1" + testService.getMessage();
    }
}
