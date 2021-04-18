package com.teyyub.testservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping("", "/{name}")
    fun getHello(@PathVariable(required = false) name: String?) = "Hello, ${name ?: "World"}!"
}
