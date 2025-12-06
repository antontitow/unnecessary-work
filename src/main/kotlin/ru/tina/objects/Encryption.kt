package ru.tina.objects

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

interface Encryption {

    @GetMapping("/hash")
    fun getHash(@RequestParam message: String?): String

    @GetMapping("/base64")
    fun getBase64(@RequestParam message: String?): String
}