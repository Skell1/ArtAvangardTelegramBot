package ru.artAvangard.TelegramBot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Instant;
import java.util.Optional;

@Slf4j
@Component
public class BotService {
    private final Bot bot;

    @Autowired
    public BotService(Bot bot) {
        this.bot = bot;
    }
    @Scheduled(cron = "${interval-in-cron}")
    public void sendMsg(){
        bot.sendMsg("");
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public void saveMessage(String text) throws JsonProcessingException {
        bot.sendMsg(text);
    }
}
