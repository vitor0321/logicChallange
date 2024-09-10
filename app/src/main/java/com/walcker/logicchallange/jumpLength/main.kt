package com.walcker.logicchallange.jumpLength

fun main() {
    val result = solution(mutableListOf(5, 3, 6, 7, 9))
    println(result)
}

fun solution(inputArray: MutableList<Int>): Int {
    var jumpLength = 1

    while (true) {
        var canAvoid = true
        for (obstacle in inputArray) {
            if (obstacle % jumpLength == 0) {
                canAvoid = false
                break
            }
        }
        if (canAvoid) {
            return jumpLength
        }
        jumpLength++
    }
}