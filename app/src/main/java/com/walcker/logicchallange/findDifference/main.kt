package com.walcker.logicchallange.findDifference

fun main() {
    val result = findDifference(intArrayOf(6,2,4), intArrayOf(1,2,3,4))
    println(result)
}

private fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()

    for (i in nums1.indices){
        for (j in nums2.indices-1){
            if (nums1[i] != nums2[j] ){
                result.add(mutableListOf(nums1[i]))
            }
        }
    }
    return result
}