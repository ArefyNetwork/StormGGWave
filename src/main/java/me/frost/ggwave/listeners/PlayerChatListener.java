package me.frost.ggwave.listeners;

import me.frost.ggwave.managers.WaveManager;
import me.frost.ggwave.utils.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatListener implements Listener {

    @EventHandler
    public void onPlayerChat(final AsyncPlayerChatEvent event) {
        if (!WaveManager.getInstance().hasWaveStarted()) {
            return;
        }
        String message = event.getMessage();
        message = ChatColor.stripColor(message);
        if (!StringUtils.startsWith(message, "gg")) {
            return;
        }

        event.setMessage(WaveManager.getInstance().getRandomType());
    }
}