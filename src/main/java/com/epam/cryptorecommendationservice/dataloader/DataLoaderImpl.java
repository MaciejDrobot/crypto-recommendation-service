package com.epam.cryptorecommendationservice.dataloader;

import com.epam.cryptorecommendationservice.model.Currency;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class DataLoaderImpl implements DataLoader {

    private List<File> cryptos;

    @Autowired
    ParserCSV parserCSV;

    @Autowired
    BatchCurrencyRepository repository;

    {
        createListOfAvailableCryptos();
    }

    @PostConstruct
    @Override
    public void loadData() throws IOException {
        repository.saveAll(parseAllRecords());
    }

    private void createListOfAvailableCryptos() {
        String PREFIX = System.getProperty("user.dir");
        String RESOURCES = "/src/main/resources/prices/";
        String PATH = PREFIX + RESOURCES;
        File prices = new File(PATH);
        cryptos = List.of(Objects.requireNonNull(prices.listFiles()));
    }

    public int numberOfAvailableCryptos() {
        return cryptos.size();
    }

    private List<Currency> parseAllRecords() throws IOException {
        List<Currency> allRecords = new ArrayList<>();
        for (File f : cryptos) {
            allRecords.addAll(parserCSV.getAllRecordsFromFile(f.getName()));
        }
        return allRecords;
    }
}
