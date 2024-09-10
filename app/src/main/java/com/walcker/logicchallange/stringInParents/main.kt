package com.walcker.logicchallange.stringInParents

fun main() {
    val result = solution("a(bc)de")
    println(result)
}

fun solution(inputString: String): String {
    val stack = mutableListOf<Char>()
    
    for (char in inputString) {
        if (char == ')') {
            val temp = mutableListOf<Char>()
            while (stack.isNotEmpty() && stack.last() != '(') {
                temp.add(stack.removeAt(stack.size - 1))
            }
            if (stack.isNotEmpty() && stack.last() == '(') {
                stack.removeAt(stack.size - 1) // Remove the '('
            }
            stack.addAll(temp)
        } else {
            stack.add(char)
        }
    }
    
    return stack.joinToString("")
}