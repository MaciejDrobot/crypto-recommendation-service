package com.epam.cryptorecommendationservice;

import com.epam.cryptorecommendationservice.controller.CurrencyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class AppTests {

	@Autowired
	private CurrencyController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
