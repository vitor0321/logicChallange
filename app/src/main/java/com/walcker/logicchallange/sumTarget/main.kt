package com.walcker.logicchallange.sumTarget

fun main() {
    val result = twoSum(intArrayOf(2, 2, 11, 15,2,7), 9)
    println(result.contentToString())
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val result: MutableList<Int> = mutableListOf()
    for (i in nums.indices - 1) {
        if (nums[i] + nums[i + 1] == target) {
            result.add(i)
            result.add(i + 1)
            return result.toIntArray()
        }
    }
    return result.toIntArray()
}