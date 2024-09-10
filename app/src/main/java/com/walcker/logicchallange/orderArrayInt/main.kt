package com.walcker.logicchallange.orderArrayInt

fun main() {
    val result = orderArrayInt(mutableListOf(2, -1, 11, 15, -1, 7))
    println(result)
}

private fun orderArrayInt(a: MutableList<Int>): MutableList<Int> {
    val map = mutableListOf<Int>()

    for (i in a.indices){
        if(a[i] > 0){
            map.add(a[i])
        }
    }
    map.sort()
    for(i in a.indices){
        if(a[i]> 0){
            a[i] = map.first()
            map.remove(map.first())
        }
    }
    return a
}