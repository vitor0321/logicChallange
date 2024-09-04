package com.walcker.logicchallange.reverseVowels

fun main() {
    val result = reverseVowels("hcolrl")
    println(result)
}

private fun reverseVowels(s: String): String {
    val vowels = "aeiouAEIOU"
    val chars = s.toCharArray()
    var left = 0
    var right = chars.size - 1

    while (left < right) {
        while (left < right && chars[left] !in vowels) {
            left++
        }
        while (left < right && chars[right] !in vowels) {
            right--
        }
        if (left < right) {
            val temp = chars[left]
            chars[left] = chars[right]
            chars[right] = temp
            left++
            right--
        }
    }

    return String(chars)
}

