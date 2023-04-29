package com.epam.cryptorecommendationservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CurrencyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private final String EXPECTED_RESPONSE = "{" +
            "\"symbol\":\"BTC\"," +
            "\"min\":33276.59," +
            "\"max\":47722.66," +
            "\"oldest\":46813.21," +
            "\"newest\":38415.79}";

    @Test
    public void shouldReturnStatusOK() throws Exception {
        mockMvc.perform(get("/currency/normalized"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void shouldReturnCorrectData() throws Exception {
        MvcResult result =
            mockMvc.perform(get("/currency/monthly-stats/BTC"))
                    .andExpect(status().isOk())
                    .andReturn();
        String actualResponse = result.getResponse().getContentAsString();
        assertEquals(EXPECTED_RESPONSE, actualResponse);
    }
}
