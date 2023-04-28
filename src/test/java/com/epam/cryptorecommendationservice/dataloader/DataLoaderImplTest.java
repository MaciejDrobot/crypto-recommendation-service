package com.epam.cryptorecommendationservice.dataloader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataLoaderImplTest {
    
    private final DataLoaderImpl loader = new DataLoaderImpl();
    
    @Test
    public void shouldReadAllFiles() {
        assertEquals(5, loader.numberOfAvailableCryptos());
    }

    @Test
    public void shouldSaveAllRecordsInDatabase() throws IOException {
        loader.loadData();
    }

}