package com.walcker.logicchallange.containsDuplicate

fun main() {
    val result = containsDuplicate(intArrayOf(1,2,3,1))
    println(result)

}

private fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (num in nums) {
        if (!set.add(num)) {
            return true
        }
    }
    return false
}