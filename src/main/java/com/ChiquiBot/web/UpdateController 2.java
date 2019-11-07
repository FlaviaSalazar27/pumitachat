package com.ChiquiBot.web;

import com.ChiquiBot.core.Update;
import org.telegram.telegrambots.meta.generics.UpdatesHandler;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("api")
public class UpdateController {
    @Inject
    private UpdatesHandler updatesHandler;
    @Path("update")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void processUpdate (Update update){

    }
}
