package com.algaworks.algasensors.temperature.processing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;


class UUIDv7Test {

    @Test
    void deveGerarUUIDv7() {
        UUID uuid = IdGenerator.generate();

        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.SECONDS);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.SECONDS);

        Assertions.assertEquals(currentDateTime, uuidDateTime);

    }
}
