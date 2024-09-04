package com.walcker.logicchallange.uniqueOccurrences

fun main() {
    uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3))
}

private fun uniqueOccurrences(arr: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (i in arr) {
        map[i] = map.getOrDefault(i, 0) + 1
    }
    return map.size == map.values.toSet().size

}