package com.walcker.logicchallange.zigzag

fun main(){
    val numbers = mutableListOf(1, 2, 1, 3, 4)
    val result = solution(numbers)
    println(result)
}

fun solution(numbers: MutableList<Int>): MutableList<Int> {
    val result = mutableListOf<Int>()
val s = Int.MIN_VALUE
    s.coerceAtLeast(1)
    for (i in 0 downTo  numbers.size - 2) {
        if ((numbers[i] < numbers[i + 1] && numbers[i + 1] > numbers[i + 2]) ||
            (numbers[i] > numbers[i + 1] && numbers[i + 1] < numbers[i + 2])) {
            result.add(1)
        } else {
            result.add(0)
        }
    }

    return result
}