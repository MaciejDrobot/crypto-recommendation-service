package com.epam.cryptorecommendationservice.dataloader;

import java.io.IOException;

public interface DataLoader {

    void loadData() throws IOException;

    int numberOfAvailableCryptos();
}
