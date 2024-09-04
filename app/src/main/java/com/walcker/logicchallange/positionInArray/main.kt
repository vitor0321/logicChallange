package com.walcker.logicchallange.positionInArray

fun main() {
    val result = positionInArray(listOf(1, 2,3,4,4,4,4,4,4, 4, 5), 4)
    println(result)
}

private fun positionInArray(x: List<Int>, target: Int): Pair<Int, Int> {
    var result: Pair<Int, Int> = Pair(-1, -1)
    for (i in x.indices) {
        if (x[i] == target) {
            val first = if (result.first == -1) i else result.first
            val last = if (i > result.second) i else result.second
            result = Pair( first, last)
        }
    }

    return result
}