package com.gymhelper.app.home;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HomeControllerTest
{
    public final String ENDPOINT = "/home";
    @Autowired
    HomeController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads()
    {
        assertThat(controller).isNotNull();
    }

    @Test
    public void itIsAvailableWithoutJwtToken() throws Exception
    {
        this.mockMvc.perform(get(ENDPOINT))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"));
    }
}
