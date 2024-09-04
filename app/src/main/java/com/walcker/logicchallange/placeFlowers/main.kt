package com.walcker.logicchallange.placeFlowers

fun main() {
    val result = canPlaceFlowers(intArrayOf(0,0), 2)
    println(result)
}

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {

    var s =""
    s.contains('s')
    var count = 0

    for (i in flowerbed.indices) {
        if (flowerbed[i] == 0) {
            val prevEmpty = (i == 0 || flowerbed[i - 1] == 0)
            val nextEmpty = (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)

            if (prevEmpty && nextEmpty) {
                count++
                flowerbed[i] = 1
            }
        }
    }

    return count >= n
}