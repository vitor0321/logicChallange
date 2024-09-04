package com.walcker.logicchallange.sumGrid

fun main() {
    val result = sumGrid(
        arrayOf(
            intArrayOf(1, 7, 2,3,5,7),
            intArrayOf(4, 5, 6,3,4,9),
        )
    )
    println(result)
}

private fun sumGrid(grid: Array<IntArray>): List<Int> {
    var sobra = 0
    var soma = 0
    var sum = 0
    val result = mutableListOf<Int>()
    for (i in grid.indices-1) {
        for (j in grid[i].indices) {
            if (i + 1 < grid.size) {
                soma = grid[i][j] + grid[i + 1][j] + sum
                sobra = 0
                sum = 0
            } else {
                soma = grid[i][j] + sum
                sobra = 0
                sum = 0
            }
            if (soma > 9) {
                sobra = soma.toString()[1].digitToInt()
                sum = soma.toString()[0].digitToInt()
                result.add(sobra)
            } else {
                result.add(soma)
            }
        }
    }
    result.add(sum)
    return result
}
