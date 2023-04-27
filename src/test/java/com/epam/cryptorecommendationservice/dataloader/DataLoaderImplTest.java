package com.epam.cryptorecommendationservice.dataloader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataLoaderImplTest {
    
    private final DataLoader loader = new DataLoaderImpl();
    
    @Test
    public void shouldReadAllFiles() {
        // given
    
        // when

        // then
        assertEquals(5, loader.numberOfAvailableCryptos());
    }

}