package com.github.steveice10.mc.protocol.data;

import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import net.kyori.adventure.text.serializer.gson.LegacyHoverEventSerializer;

public final class DefaultComponentSerializer {
    static LegacyHoverEventSerializer legacySerializer;
    private static GsonComponentSerializer serializer = GsonComponentSerializer.builder()
            .legacyHoverEventSerializer(legacySerializer)
            .build();

    public static GsonComponentSerializer get() {
        return serializer;
    }

    public static void set(GsonComponentSerializer serializer) {
        DefaultComponentSerializer.serializer = serializer;
    }

    private DefaultComponentSerializer() {
    }
}
