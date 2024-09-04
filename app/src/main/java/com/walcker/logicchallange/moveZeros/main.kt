package com.walcker.logicchallange.moveZeros

fun main() {
    moveZeros(intArrayOf(1,0,1,0))
}

private fun moveZeros(nums: IntArray) {
    var lastNonZeroFoundAt = 0

    // Move all non-zero elements to the front of the array
    for (i in nums.indices) {
        if (nums[i] != 0) {
            nums[lastNonZeroFoundAt] = nums[i]
            lastNonZeroFoundAt++
        }
    }

    // Fill the remaining positions with zeros
    for (i in lastNonZeroFoundAt until nums.size) {
        nums[i] = 0
    }
    println(nums.toList().toString())
}