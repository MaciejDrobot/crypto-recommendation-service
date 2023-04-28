package com.epam.cryptorecommendationservice.dataloader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ParserCSVTest {

    private final ParserCSV parser = new ParserCSV();

    @Test
    public void shouldReadAllRecordsFromFile() throws IOException {
        var allRecords = parser.getAllRecordsFromFile("BTC_values.csv");
        assertEquals(100, allRecords.size());
    }
}