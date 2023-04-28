package com.epam.cryptorecommendationservice.dataloader;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataLoaderImplTest {

    @Autowired
    private DataLoaderImpl loader;

    @Autowired
    private BatchCurrencyRepository repository;
    
    @Test
    public void shouldReadAllFiles() {
        assertEquals(5, loader.numberOfAvailableCryptos());
    }

    @Test
    public void shouldSaveAllRecordsInDatabase() throws IOException {
        loader.loadData();
        assertEquals(450, repository.getAllRecords().size());
    }

}