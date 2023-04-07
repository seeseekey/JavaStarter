package org.example.starter.utils;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Utility class for resources operations
 */
public final class Resources {

    private Resources() {
    }

    public static String get(String resource) throws IOException {

        URL url = com.google.common.io.Resources.getResource(resource);
        return com.google.common.io.Resources.toString(url, StandardCharsets.UTF_8);
    }

    public static List<String> getLines(String resource) throws IOException {

        URL url = com.google.common.io.Resources.getResource(resource);
        return com.google.common.io.Resources.readLines(url, StandardCharsets.UTF_8);
    }
}
