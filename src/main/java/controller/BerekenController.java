package controller;

import service.Berekening;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Michel Koolwaaij on 23-09-19.
 */
@Path("/")
public class BerekenController {

    private Berekening b;

    @Inject // Dit weghalen voor mooi voorbeeld Internal Server Error
    public void setB(Berekening b){
        this.b = b;
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doGetHelloTxt() {
        return "Hallo, welkom bij het grote MIC berekening spektakel";
    }

    @Path("/verdubbel")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doDouble(@QueryParam("number") int number) {
        return b.verdubbel(number);
    }

    @Path("/kwadraat/{number}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doSquare(@PathParam("number") int number) {
        return b.kwadraat(number);
    }

}
