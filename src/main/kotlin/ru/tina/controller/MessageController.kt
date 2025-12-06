package ru.tina.controller


import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.tina.objects.Encryption
import ru.tina.objects.First

@RestController
class MessageController : Encryption {

    override fun getHash(@RequestParam message: String?): String {
        var first = First(message)
        return first.getHash();
    }

    override fun getBase64(@RequestParam message: String?): String {
        var first = First(message)
        return first.getBase64();
    }
}
