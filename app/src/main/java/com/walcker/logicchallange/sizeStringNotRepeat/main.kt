package com.walcker.logicchallange.sizeStringNotRepeat

fun main() {
    val result = lengthOfLongestSubstring("pwwkew")
    println(result)
}

private fun lengthOfLongestSubstring(s: String): Int {
    var max = 0
    var start = 0
    val map = mutableMapOf<Char, Int>()
    for (i in s.indices) {
        if (map.containsKey(s[i])) {
            start = maxOf(start, map[s[i]]!! + 1)
        }
        map[s[i]] = i
        max = maxOf(max, i - start + 1)
    }
    return max
}