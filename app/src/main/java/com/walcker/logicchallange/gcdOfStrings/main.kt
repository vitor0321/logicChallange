package com.walcker.logicchallange.gcdOfStrings

fun main() {
    val result = gcdOfStrings("ABCABC", "ABC")
    println(result)
}

fun gcdOfStrings(str1: String, str2: String): String {
    if ((str1 + str2) != (str2 + str1)) return ""
    val gcdLength = gcd(str1.length, str2.length)
    return str1.substring(0, gcdLength)
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b, a % b)
}