package com.teyyub.testservice.controllers

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@WebMvcTest
internal class HelloControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun `hello with passed name`() {
        val name = "teyyub"
        mockMvc.perform(get("/hello/${name}"))
            .andExpect(status().isOk)
            .andExpect(content().string("Hello, ${name}!"))
    }

    @Test
    fun `hello without passed name`() {
        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk)
            .andExpect(content().string("Hello, World!"))
    }
}
