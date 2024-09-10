package com.walcker.logicchallange.containsNearbyDuplicate

fun main() {

        val result = containsNearbyDuplicate(intArrayOf(1,2,3,1), 3)
        println(result)

}

private fun  containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val indexMap = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        if (indexMap.containsKey(nums[i]) && i - indexMap[nums[i]]!! <= k) {
            return true
        }
        indexMap[nums[i]] = i
    }

    return false
}