package org.example.starter.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.ZonedDateTime;

/**
 * Utility class for an extended GSON object
 */
public class GsonExtended {

    private static Gson gson = null;

    private GsonExtended() {
    }

    public static Gson getGson() {

        if (gson == null) {

            gson = new GsonBuilder()

                    .registerTypeAdapter(ZonedDateTime.class, new TypeAdapter<ZonedDateTime>() {
                        @Override
                        public void write(JsonWriter out, ZonedDateTime value) throws IOException {
                            out.value(value.toString());
                        }

                        @Override
                        public ZonedDateTime read(JsonReader in) throws IOException {
                            return ZonedDateTime.parse(in.nextString());
                        }
                    })
                    .enableComplexMapKeySerialization()
                    .setPrettyPrinting()
                    .create();
        }

        return gson;
    }
}
