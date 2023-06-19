package ru.artAvangard.TelegramBot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class BotResource {
    //private final Bot bot;
    private final BotService botService;

    @Autowired
    public BotResource(BotService botService
    ){
        this.botService = botService;
    }

    @GET
    @Path("/home/")
    public String home (){
        return "home";
    }
    @POST
    @Path("/callBack")
    @Consumes(MediaType.APPLICATION_JSON)
    public Callback saveMessage(String requestBody) throws JsonProcessingException {
        JsonNode node = new ObjectMapper().readTree(requestBody);
        String mail = node.get("mail").asText();
        String telephone = node.get("telephone").asText();
        String fio = node.get("fio").asText();
        String text = node.get("text").asText();

        Callback callback = new Callback(mail, telephone, fio, text);
        botService.saveMessage(callback.toString());
        return callback;
    }
}
