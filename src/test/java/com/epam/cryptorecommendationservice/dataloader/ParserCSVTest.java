package com.epam.cryptorecommendationservice.dataloader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ParserCSVTest {

    private final ParserCSV parser = new ParserCSV();

    @Test
    public void shouldReadAllRecords() throws IOException {
        // given

        // when
        var allRecords = parser.getAllRecords("BTC_values.csv");

        // then
        assertEquals(100, allRecords.size());
    }
}