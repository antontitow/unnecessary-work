package ru.tina.objects

import java.util.*
import java.util.logging.Logger

class First(var name: String? = "Tina") {
    private val innerFirst = InnerFirst(name)
    fun getHash(): String {
        return innerFirst.hash();
    }

    fun getBase64(): String {
        return innerFirst.base64();
    }
}

class InnerFirst(var innerName: String? = null) {
    private val logger = Logger.getLogger(InnerFirst::class.java.name)
    fun hash(): String {
        logger.info { "Get hash of name: $innerName" }

        return innerName?.hashCode()?.toString() ?: "Не передан параметр"
    }

    fun base64(): String {
        logger.info { "Get base64 of name: $innerName" }

        return innerName?.let {
            Base64.getEncoder().encodeToString(innerName?.toByteArray())
        } ?: "Не передан параметр"
    }

}