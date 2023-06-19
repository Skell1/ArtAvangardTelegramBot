package ru.artAvangard.TelegramBot;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.inject.Inject;
import org.springframework.web.bind.annotation.*;


@RestController
public class BotResource {
    private final BotService botService;

    @Inject
    public BotResource(BotService botService
    ){
        this.botService = botService;
    }
    @PostMapping("/callBack")
    public Callback saveMessage(@RequestBody Callback callback) throws JsonProcessingException {
        System.out.println(callback);
        botService.saveMessage(callback.toString());
        return callback;
    }
}
