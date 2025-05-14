package io.github.wooenrico.jersey.resource;

import io.github.wooenrico.jersey.resource.service.V1Resource;
import io.github.wooenrico.jersey.resource.service.V2Resource;
import jakarta.ws.rs.Path;

@Path("/")
public class RootResource extends AbstractResource {

    @Path("v1")
    public V1Resource getV1Resource() {
        return getSubResource(V1Resource.class);
    }

    @Path("v2")
    public V2Resource getV2Resource() {
        return getSubResource(V2Resource.class);
    }
}
