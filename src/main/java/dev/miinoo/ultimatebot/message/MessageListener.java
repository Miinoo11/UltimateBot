package dev.miinoo.ultimatebot.message;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;

public class MessageListener extends ListenerAdapter {

    private Collection<String> emojis = Arrays.asList("\uD83D\uDC4D", "\uD83D\uDC4E");

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Message message = event.getMessage();
        if (message.getChannel().getId().equals("743585179536326798")) {
            if (message.getContentRaw().toLowerCase().contains("suggestion")) {
                for(String emoji : emojis) {
                    message.addReaction(emoji).queue();
                }
            }
        }
    }
}
