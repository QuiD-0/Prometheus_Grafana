package com.quid.monitoring.gateway.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/api")
class ApiController {

    @GetMapping("/test")
    fun test(): String {
        println("test")
        return "test"
    }
}