package com.walcker.logicchallange.sumHalfInt

fun main() {
    val result = sumHalfInt(523455)
    println(result)
}

private fun sumHalfInt(n : Int) : Boolean {
        val nString = n.toString()
        val nSize = nString.length
        val first = nString.substring(0, nSize / 2)
        val second = nString.substring(nSize / 2, nSize)

        var sum1 = 0
        var sum2 = 0

        for (i in first.indices) {
            sum1 += first[i].toString().toInt()
        }

        for (i in second.indices) {
            sum2 += second[i].toString().toInt()
        }

        return sum1 == sum2
}