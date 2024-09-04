package com.walcker.logicchallange.findMaxAverage

fun main() {
    val result = findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4)
    println(result)
}

private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var sum = 0
    for (i in 0 until k) {
        sum += nums[i]
    }
    var maxSum = sum
    for (i in k until nums.size) {
        sum += nums[i] - nums[i - k]
        maxSum = maxSum.coerceAtLeast(sum)
    }
    return maxSum.toDouble() / k
}