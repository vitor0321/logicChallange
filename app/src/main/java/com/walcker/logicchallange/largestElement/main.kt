package com.walcker.logicchallange.largestElement

fun main() {
    val result= largestElement(intArrayOf(1,7,9,7,8,9,9,10), 3)
    println(result)
}

private fun largestElement(arr: IntArray, k: Int): List<Int> {
    if (arr.isEmpty() || k <= 0) return emptyList()

    val sortedArr = arr.sortedArrayDescending()

    return sortedArr.take(k).toList()
}