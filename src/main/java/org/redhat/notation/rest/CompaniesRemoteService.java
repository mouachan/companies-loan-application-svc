package org.redhat.notation.rest;



import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.redhat.notation.Notation;


@Path("/")
@RegisterRestClient
public interface CompaniesRemoteService {
    @GET
    @Path("/companies/exist/{siren}")
    @Produces("application/json")
    boolean get(@PathParam("siren") String siren);

    @POST
    @Path("/notation/add")
    @Produces("application/json")
    List<Notation> add(@PathParam("notation")Notation notation);

}