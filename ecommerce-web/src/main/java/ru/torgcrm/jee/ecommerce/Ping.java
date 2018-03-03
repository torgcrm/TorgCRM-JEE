package ru.torgcrm.jee.ecommerce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ping")
public class Ping {
    @GET
    public String ping() {
        return "ok";
    }
}
