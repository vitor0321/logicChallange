package com.walcker.logicchallange.frequentElements

fun main() {
    val result = topKFrequent(intArrayOf(1,1,1,1,1,1,4,5,6,6,6,6,7,7,7,7,7), 3)
    println(result.toList())
}

private fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    val list = mutableListOf<Int>()

    for (i in nums.indices) {
        var cont = 1
        for (j in nums.indices) {
            if (nums[i] == nums[j]) {
                map[nums[i]] = cont++
            }
        }
    }

    val pairList = map.toList().toMutableList()

    for (i in pairList.indices) {
        for (j in i + 1 until pairList.size) {
            if (pairList[i].second < pairList[j].second) {
                val temp = pairList[i]
                pairList[i] = pairList[j]
                pairList[j] = temp
            }
        }
    }

    val sortedMap = pairList.toMap()

    for (i in 0 until k) {
        if (i >= sortedMap.size) break
        list.add(sortedMap.keys.elementAt(i))
    }

    return list.toIntArray()
}