package com.walcker.logicchallange.orderMovieArrayInt

fun main() {
    val result = solution(mutableListOf(2, 3, 1, 4))
    println(result)
}

fun solution(inputArray: MutableList<Int>): Int {
    var moves = 0

    for (i in 1 until inputArray.size) {
        if (inputArray[i] <= inputArray[i - 1]) {
            val increment = inputArray[i - 1] - inputArray[i] + 1
            inputArray[i] += increment
            moves += increment
        }
    }

    return moves
}