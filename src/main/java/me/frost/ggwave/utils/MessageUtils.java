package me.frost.ggwave.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import java.util.List;

public class MessageUtils {
    private static MessageUtils instance = null;

    public static MessageUtils getInstance() {
        return (instance == null ? instance = new MessageUtils() : instance);
    }

    public void sendMessage(final String message, final CommandSender sender) {
        sender.sendMessage(ColorUtil.colorString(message));
    }

    public void sendMessageList(final List<String> message, final CommandSender sender) {
        message.forEach(m -> sender.sendMessage(ColorUtil.colorString(m)));
    }

    public void broadcastMessage(final String message) {
        Bukkit.broadcastMessage(ColorUtil.colorString(message));
    }

    public void broadcastMessageList(final List<String> message) {
        message.forEach(m -> Bukkit.broadcastMessage(ColorUtil.colorString(m)));
    }
}