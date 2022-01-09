package dev.miinoo.ultimatebot;

import dev.miinoo.ultimatebot.listener.ReadyListener;
import dev.miinoo.ultimatebot.message.MessageListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class UltimateBot {

    private static String name;
    private static String prefix;

    public static void main(String[] args) throws LoginException, InterruptedException {
        name = "UltimateBot";
        prefix = ".";
        JDA bot = JDABuilder.createDefault(args[0])
                .disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE, CacheFlag.ACTIVITY)
                .addEventListeners(new ReadyListener())
                .addEventListeners(new MessageListener())
                .build();

        bot.awaitReady();
    }

    public static String getName() {
        return name;
    }

    public static String getPrefix() {
        return prefix;
    }
}
