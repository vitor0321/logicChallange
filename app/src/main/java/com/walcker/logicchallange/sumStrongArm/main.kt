package com.walcker.logicchallange.sumStrongArm

fun main() {
    val result = solution(15, 10, 15, 10)
    println(result)
}

fun solution(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {

    val yourStrongest = maxOf(yourLeft, yourRight)
    val yourWeakest = minOf(yourLeft, yourRight)
    val friendsStrongest = maxOf(friendsLeft, friendsRight)
    val friendsWeakest = minOf(friendsLeft, friendsRight)

    return yourStrongest == friendsStrongest && yourWeakest == friendsWeakest
}
