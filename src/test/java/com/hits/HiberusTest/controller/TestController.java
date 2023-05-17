package com.hits.HiberusTest.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.CoreMatchers.is;


@SpringBootTest
@AutoConfigureMockMvc
public class TestController {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void test1() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/v1/price")
                        .param("productId","35455")
                        .param("brandId","1")
                        .param("date","2020-06-14 10:00:00")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .isOk())
                .andExpect(MockMvcResultMatchers
                        .content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("@.price", is(35.5)));
    }


    @Test
    public void test2() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/v1/price")
                        .param("productId","35455")
                        .param("brandId","1")
                        .param("date","2020-06-14 16:00:00")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .isOk())
                .andExpect(MockMvcResultMatchers
                        .content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.price", is(25.45)));
    }


    @Test
    public void test3() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/v1/price")
                        .param("productId","35455")
                        .param("brandId","1")
                        .param("date","2020-06-14 21:00:00")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .isOk())
                .andExpect(MockMvcResultMatchers
                        .content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.price", is(35.5)));
    }


    @Test
    public void test4() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/v1/price")
                        .param("productId","35455")
                        .param("brandId","1")
                        .param("date","2020-06-15 10:00:00")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .isOk())
                .andExpect(MockMvcResultMatchers
                        .content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.price", is(30.5)));
    }


    @Test
    public void test5() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/v1/price")
                        .param("productId","35455")
                        .param("brandId","1")
                        .param("date","2020-06-16 21:00:00")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .isOk())
                .andExpect(MockMvcResultMatchers
                        .content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.price", is(38.95)));
    }
}
