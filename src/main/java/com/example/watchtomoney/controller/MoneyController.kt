package com.example.watchtomoney.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/money/")
class MoneyController {



    @GetMapping
    fun test1(): Any {
        return ""
    }

    @PostMapping
    fun test2(): Any {
        return ""
    }

    @PutMapping
    fun test3(): Any {
        return ""
    }

    @DeleteMapping
    fun test4(): Any {
        return ""
    }

}