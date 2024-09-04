package com.walcker.logicchallange.uberMinStack

fun main() {

    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    println(minStack.getMin()) // return -3
    minStack.pop()
    println(minStack.top())    // return 0
    println(minStack.getMin()) // return -2
}

class MinStack() {
    private val stack = mutableListOf<Int>()
    private val minStack = mutableListOf<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
        if (minStack.isEmpty() || `val` <= minStack.last()) {
            minStack.add(`val`)
        }
    }

    fun pop() {
        if (stack.isNotEmpty()) {
            val removed = stack.removeAt(stack.size - 1)
            if (removed == minStack.last()) {
                minStack.removeAt(minStack.size - 1)
            }
        }
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}