package ru.artAvangard.TelegramBot;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/")
public class AppConfig extends ResourceConfig {
    public AppConfig() {
        register(BotResource.class);
    }
}
