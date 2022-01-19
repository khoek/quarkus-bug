package io.hoek.quarkusbug;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("myapi")
@DenyAll
public class MyResource {

    @GET
    @Path("")
    @PermitAll
    public Response ping() {
        return Response.ok().build();
    }
}
