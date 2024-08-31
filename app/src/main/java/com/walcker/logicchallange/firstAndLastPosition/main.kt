package com.walcker.logicchallange.firstAndLastPosition

fun main() {
    val result = searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8)
    println(result)
}

private fun searchRange(nums: IntArray, target: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in nums.indices) {
        if (nums[i] == target) {
            list.add(i)
        }
    }
    if (list.isEmpty()) {
        list.add(-1)
        list.add(-1)
    }
    return list
}