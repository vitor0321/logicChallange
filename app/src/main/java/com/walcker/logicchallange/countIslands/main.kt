package com.walcker.logicchallange.countIslands

fun main() {
    countIslands(
        mutableListOf(
            mutableListOf(1, 0, 0, 1, 0, 0, 0, 1),
            mutableListOf(1, 0, 1, 0, 1),
            mutableListOf(1, 0, 1, 1, 0),
            mutableListOf(0, 0, 0, 0, 0),
            mutableListOf(1, 0, 1, 0, 1),

            )
    )
}

private fun countIslands(grid: MutableList<MutableList<Int>>) {
    var count = 0
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 1) {
                count++
                dfs(grid, i, j)
            }
        }
    }

    println(count)
}

private fun dfs(grid: MutableList<MutableList<Int>>, i: Int, j: Int) {
    if (i < 0 || i >= grid.size || j < 0 || j >= grid[i].size || grid[i][j] == 0) {
        return
    }
    grid[i][j] = 0

    dfs(grid, i + 1, j)
    dfs(grid, i - 1, j)
    dfs(grid, i, j + 1)
    dfs(grid, i, j - 1)
}