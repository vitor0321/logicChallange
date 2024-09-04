package com.walcker.logicchallange.longestHarmonious

fun main() {
    val result = longestHarmonious(intArrayOf(1,3,2,2,5,2,3,7))
    println(result)
}

private fun longestHarmonious(nums: IntArray): Int {
    val frequencyMap = mutableMapOf<Int, Int>()

    // Contar a frequência de cada número
    for (num in nums) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    var maxLength = 0

    // Verificar pares harmoniosos
    for ((num, count) in frequencyMap) {
        if (frequencyMap.containsKey(num + 1)) {
            val currentLength = count + frequencyMap[num + 1]!!
            maxLength = maxOf(maxLength, currentLength)
        }
    }

    return maxLength
}