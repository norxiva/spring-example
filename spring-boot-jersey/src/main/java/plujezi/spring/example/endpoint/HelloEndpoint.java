package plujezi.spring.example.endpoint;


import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloEndpoint {

    @Path("say")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response say(){
        return Response.ok().entity("{\"success\": true}").build();
    }

    @Path("hi")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response hi(@QueryParam("name") @NotNull String name) {
        return Response.ok().entity("{\"say\": \""+name+"\"}").build();
    }



}
