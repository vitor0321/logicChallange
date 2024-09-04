package com.walcker.logicchallange.isSubsequence

fun main() {
    val result = isSubsequence("acb", "ahbgdc")
    println(result)
}

private fun isSubsequence(s: String, t: String): Boolean {
    var x = ""
    var z = 0
    for (i in s.indices) {
        for (j in z until t.length) {
            if (s[i] == t[j]) {
                x += s[i]
                z = j + 1
                break
            }
        }
    }
    return s == x
}