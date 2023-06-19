package ru.artAvangard.TelegramBot;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class BotService {
    private final Bot bot;

    @Autowired
    public BotService(Bot bot) {
        this.bot = bot;
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public void saveMessage(String text) throws JsonProcessingException {
        bot.sendMsg(text);
    }
}
