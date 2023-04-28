package com.epam.cryptorecommendationservice.dataloader;

import com.epam.cryptorecommendationservice.model.Currency;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParserCSV {

    private final String[] HEADERS = {"timestamp", "symbol", "price"};
    private final String PREFIX = "src/main/resources/prices/";
    private final CSVFormat csvFormat;

    {
        csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(HEADERS)
                .setSkipHeaderRecord(true)
                .build();
    }

    public List<Currency> getAllRecordsFromFile(String fileName) throws IOException {
        Reader in = new FileReader(PREFIX + fileName);
        Iterable<CSVRecord> records = csvFormat.parse(in);
        List<Currency> list = new ArrayList<>();
        for (CSVRecord record : records) {
            list.add(new Currency(
                    Long.parseLong(record.get("timestamp")),
                    record.get("symbol"),
                    Float.parseFloat(record.get("price"))
            ));
        }
        return list;
    }
}
