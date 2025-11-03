package com.isabele.at1.at1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(NomeController.class)
public class NomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testMeuNome() throws Exception {
        mockMvc.perform(get("/meu-nome"))
                .andExpect(status().isOk())
                .andExpect(content().string("Isabele Leticia Queiroz"));
    }

}
