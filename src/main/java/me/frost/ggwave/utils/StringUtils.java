package me.frost.ggwave.utils;


public final class StringUtils {

    private StringUtils() {
        throw new RuntimeException("Utility class cannot be instantiated!");
    }

    public static boolean startsWith(final String string, final String prefix) {
        return string.regionMatches(true, 0, prefix, 0, prefix.length());
    }

    public static boolean endsWith(final String string, final String suffix) {
        final int suffixLength = suffix.length();
        return string.regionMatches(true, string.length() - suffixLength, suffix, 0, suffixLength);
    }
}
