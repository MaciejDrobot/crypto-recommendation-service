package com.epam.cryptorecommendationservice.dataloader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataLoaderImplTest {
    
    private final DataLoaderImpl loader = new DataLoaderImpl();
    
    @Test
    public void shouldReadAllFiles() {
        // given
        loader.loadData();
        loader.printFileNames();
    
        // when

        // then
        assertEquals(5, loader.numberOfAvailableCryptos());
    }

}