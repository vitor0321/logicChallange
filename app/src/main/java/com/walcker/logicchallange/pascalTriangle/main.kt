package com.walcker.logicchallange.pascalTriangle

fun main() {

    generate(4)
}

private fun generate(sizeTriangle: Int) {
    val result = mutableListOf<List<Int>>()

    for (i in 0 until sizeTriangle) {
        val list = mutableListOf(1)
        for (j in 1 until i ) {
            val prev = result[i - 1]
            list.add(prev[j - 1] + prev[j])
        }
        if (i > 0) list.add(1)
        result.add(list)
    }
    println(result)
}