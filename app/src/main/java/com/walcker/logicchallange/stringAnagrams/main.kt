package com.walcker.logicchallange.stringAnagrams

fun main() {

    val result = stringAnagrams(s1 = "danger", s2 = "garden")
    println(result)
}

private fun stringAnagrams(s1: String, s2: String): Boolean {
    var result = mutableListOf<Boolean>()

    if (s1.length != s2.length ) return false

    for (i in s1.indices) {
        for (j in s2.indices){
            if (s2.contains(s1[i])){
                result.add( true)
            }else{
                result.add(false)
            }
        }
    }

    val check = !result.contains(false)
    return check
}