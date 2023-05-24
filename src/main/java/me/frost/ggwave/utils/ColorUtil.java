package me.frost.ggwave.utils;

import org.bukkit.ChatColor;

public class ColorUtil {
    public static String colorString(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    private ColorUtil() {
        throw new RuntimeException("Utility class cannot be instantiated!");
    }
}
