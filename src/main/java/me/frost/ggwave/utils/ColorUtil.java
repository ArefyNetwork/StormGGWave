package me.frost.ggwave.utils;

import org.bukkit.ChatColor;

public class ColorUtil {
    public static String colorString(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    // Empty constructor to stop instantiation of Utility class
    private ColorUtil() {

    }
}
