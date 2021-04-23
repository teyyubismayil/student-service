package com.teyyub.testservice.controllers

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest
internal class ByeControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun `bye with passed name`() {
        val name = "teyyub"
        mockMvc.perform(MockMvcRequestBuilders.get("/bye/${name}"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("Bye, ${name}!"))
    }

    @Test
    fun `bye without passed name`() {
        mockMvc.perform(MockMvcRequestBuilders.get("/bye"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("Bye, World!"))
    }
}
