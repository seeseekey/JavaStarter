package org.example.starter.utils;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for file operations
 */
public class Files {

    private Files() {
    }

    public static List<String> getFiles(String directoryPath) throws IOException {

        List<String> files = new ArrayList<>();

        List<Path> paths = getFiles(Paths.get(directoryPath));

        for (Path path : paths) {
            files.add(path.toString());
        }

        return files;
    }

    private static List<Path> getFiles(Path path) throws IOException {

        List<Path> files = new ArrayList<>();

        try (DirectoryStream<Path> stream = java.nio.file.Files.newDirectoryStream(path)) {

            for (Path entry : stream) {

                if (java.nio.file.Files.isDirectory(entry)) {
                    files.addAll(getFiles(entry));
                } else {
                    files.add(entry);
                }

            }
        }

        return files;
    }
}
