package com.walcker.logicchallange.numberOfCandies

fun main() {

    val result = kidsWithCandies(intArrayOf(4,2,1,1,2), 1)
    println(result)
}

private fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val  result = mutableListOf<Boolean>()
    for (i in candies.indices) {
        result.add(candies[i] + extraCandies >= candies.max())
    }


    return result
}