package dev.miinoo.ultimatebot.listener;

import dev.miinoo.ultimatebot.UltimateBot;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public class ReadyListener implements EventListener {

    @Override
    public void onEvent(@NotNull GenericEvent event) {
        if(event instanceof ReadyEvent) {
            Logger.getLogger(UltimateBot.getName()).info("Finished startup!");
        }
    }
}
