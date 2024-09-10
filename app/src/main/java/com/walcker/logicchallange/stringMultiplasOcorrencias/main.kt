package com.walcker.logicchallange.stringMultiplasOcorrencias


fun main() {
    val s1 = "abc"
    val s2 = "abcdfg"
    val result = solution(s1, s2)
    println(result)
}

fun solution(s1: String, s2: String): Int {
    val charCount = mutableMapOf<Char, Int>()
    var count = 0

    // Contar ocorrências de cada caractere em s1
    for (char in s1) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    // Contar caracteres comuns em s2
    for (char in s2) {
        if (charCount.getOrDefault(char, 0) > 0) {
            count++
            charCount[char] = charCount[char]!! - 1
        }
    }

    return count
}