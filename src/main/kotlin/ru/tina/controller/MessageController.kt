package ru.tina.controller;


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.tina.objects.First

@RestController
public class MessageController {

    @GetMapping("/hash")
    fun getHash(@RequestParam message: String?): String {
        var first = First(message)
        return first.getHash();
    }
}
