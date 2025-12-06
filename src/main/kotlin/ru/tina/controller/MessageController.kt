package ru.tina.controller


import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.tina.objects.Encryption
import ru.tina.objects.First

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Crypto Messaging API", description = "API для криптографических операций с сообщениями")
class MessageController : Encryption {

    @Operation(summary = "Получить хэш сообщения")
    override fun getHash(
        @Parameter(
            description = "Сообщение для шифрования",
            required = false
        )
        @RequestParam message: String?
    ): String {
        var first = First(message)
        return first.getHash();
    }

    @Operation(summary = "Получить Base64 сообщения")
    override fun getBase64(
        @Parameter(
            description = "Сообщение для шифрования",
            required = false
        ) @RequestParam message: String?
    ): String {
        var first = First(message)
        return first.getBase64();
    }
}
