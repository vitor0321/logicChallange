package com.walcker.logicchallange.palindrome

fun solution(inputString: String): Boolean {
    val charCount = mutableMapOf<Char, Int>()

    // Count the frequency of each character
    for (char in inputString) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    // Check the number of characters with odd frequencies
    var oddCount = 0
    for (count in charCount.values) {
        if (count % 2 != 0) {
            oddCount++
        }
    }

    // A string can be rearranged to form a palindrome if there is at most one character with an odd frequency
    return oddCount <= 1
}

// Example usage
fun main() {
    val inputString = "aabb"
    println(solution(inputString))  // Output: true
}