package com.walcker.logicchallange.longestSubstring

fun main() {
    val result = longestSubstring("bbbbbbbsaaadfdsdf", 3)
    println(result)
}

private fun longestSubstring(s: String, k: Int):List<String> {
    val list = mutableListOf<String>()
    val list2 = mutableListOf<String>()

    for (i in s.indices){
        for (j in i until s.length){
            if (s[i] == s[j] && !list.contains(s[i].toString())){
                list.add(s[i].toString())
            }
        }
    }
    for (i in 0 until k){
        list2.add(list[i])
    }

    return list2
}