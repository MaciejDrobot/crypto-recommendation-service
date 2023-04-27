package com.epam.cryptorecommendationservice.dataloader;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.Objects;

@Service
public class DataLoaderImpl implements DataLoader {

    private List<File> cryptos;

    {
        createListOfAvailableCryptos();
    }

    @Override
    public void loadData() {

    }

    private void createListOfAvailableCryptos() {
        String PREFIX = System.getProperty("user.dir");
        String RESOURCES = "/src/main/resources/prices/";
        String PATH = PREFIX + RESOURCES;
        System.out.println(PATH);
        File prices = new File(PATH);
        cryptos = List.of(Objects.requireNonNull(prices.listFiles()));
    }

    public int numberOfAvailableCryptos() {
        return cryptos.size();
    }
}
