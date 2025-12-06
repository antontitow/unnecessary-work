package ru.tina.objects

import java.util.logging.Logger


class First(var name: String? = "Tina") {
    private val innerFirst = InnerFirst(name)
    fun getHash(): String {
        return innerFirst.hash();
    }
}

class InnerFirst(var innerName: String? = null) {
    private val logger = Logger.getLogger(InnerFirst::class.java.name)
    fun hash(): String {
        logger.info { "Get hash of name: $innerName" }
        return innerName?.hashCode()?.toString() ?: "Не передан параметр"
    }
}