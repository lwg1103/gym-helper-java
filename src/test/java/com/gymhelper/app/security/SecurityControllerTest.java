package com.gymhelper.app.security;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.*;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.yml")
public class SecurityControllerTest
{
    public final String AUTH_ENDPOINT = "/authenticate";
    @Autowired
    SecurityController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads()
    {
        assertThat(controller).isNotNull();
    }

    @Test
    public void authenticateReturns400IfNoDataProvided() throws Exception
    {
        this.mockMvc.perform(post(AUTH_ENDPOINT)).andExpect(status().isBadRequest());
    }

    @ParameterizedTest
    @CsvSource({" , ", "user,user1", "user1,user"})
    public void authenticateReturnsResponseWith403CodeIfWrongCredentialsProvided(String username, String password) throws Exception
    {
        String inputData = String.format("{\"username\": \"%s\", \"password\": \"%s\"}", username, password);

        mockMvc.perform(post(AUTH_ENDPOINT).contentType("application/json").content(inputData))
                .andExpect(status().isForbidden())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.status", is(403)))
                .andExpect(jsonPath("$.error", is("Credentials Error")))
                .andExpect(jsonPath("$.message", is("Wrong or empty credentials")));
    }

    @Test
    public void authenticateReturnsJwtTokenWith200CodeIfCorrectCredentialsProvided() throws Exception
    {
        mockMvc.perform(post(AUTH_ENDPOINT).contentType("application/json")
                        .content("{\"username\": \"user1\", \"password\": \"user1\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.jwtToken", isA(String.class)))
                .andExpect(jsonPath("$.jwtToken", hasLength(131)));
    }
}
