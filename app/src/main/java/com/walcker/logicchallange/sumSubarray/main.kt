package com.walcker.logicchallange.sumSubarray

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val result = sumSubarray(intArrayOf(0,1,1,3,3), 4)
    println(result)
}

private fun sumSubarray(nums: IntArray, k: Int): Double {
    val margen = (nums.size - k) / 2
    var soma: BigDecimal = BigDecimal.ZERO
    for (i in margen until margen + k) {
        soma = soma.add(nums[i].toBigDecimal())
    }
    val result = soma.divide(k.toBigDecimal(), 5, RoundingMode.DOWN)
    return result.setScale(5, RoundingMode.DOWN).toDouble()
}