package com.walcker.logicchallange.ipValidation

fun main() {
    val result = solution("172.12.234.1")
    println(result)
}

fun solution(inputString: String): Boolean {
    val parts = inputString.split(".")
    if (parts.size != 4) return false

    for (part in parts) {
        if (part.isEmpty() || part.length > 3) return false
        if (part.any { !it.isDigit() }) return false
        if (part.toIntOrNull() !in 0..255) return false
        if (part.length > 1 && part.startsWith("0")) return false
    }

    return true
}