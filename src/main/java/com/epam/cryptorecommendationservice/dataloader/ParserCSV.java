package com.epam.cryptorecommendationservice.dataloader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParserCSV {

    String[] HEADERS = {"timestamp", "symbol", "price"};

    Reader in = new FileReader("src/main/resources/prices/BTC_values.csv");

    CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
            .setHeader(HEADERS)
            .setSkipHeaderRecord(true)
            .build();

    Iterable<CSVRecord> records = csvFormat.parse(in);

    public ParserCSV() throws IOException {
    }

    public List<Currency> getAllRecords() {
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



























//    private final String COMMA_DELIMITER = ",";
//    public final int TIMESTAMP = 0;
//    public final int SYMBOL = 1;
//    public final int PRICE = 2;
//    private BufferedReader fileReader;
//
//    public ParserCSV() throws IOException {
//        this.fileReader = null;
//    }
//
//    public List<Currency> allEntries(String fileName) {
//        return readCSVFile(fileName);
//    }
//
//    private List<Currency> readCSVFile(String fileName) {
//        try {
//            List<Currency> currencies = new ArrayList<>();
//            String line;
//            fileReader = new BufferedReader(new FileReader(fileName));
//            fileReader.readLine();
//            while ((line = fileReader.readLine()) != null){
//                String[] fields = line.split(COMMA_DELIMITER);
//                if(fields.length > 0) {
//                    Currency currency =
//                            new Currency(
//                                    Integer.parseInt(fields[TIMESTAMP]),
//                                    fields[SYMBOL],
//                                    Float.parseFloat(fields[PRICE]));
//                    currencies.add(currency);
//                }
//            }
//            return currencies;
//        } catch (Exception e) {
//            System.out.println("Error in CsvFileReader !!!");
//        } finally {
//            try {
//                fileReader.close();
//            } catch (IOException e) {
//                System.out.println("Error while closing fileReader !!!");
//            }
//        }
//        return null;
//    }
//}
