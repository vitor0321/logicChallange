package com.walcker.logicchallange.countIslandsMax

fun main() {
    val result = countIslandsMax(
        mutableListOf(
            mutableListOf(1, 1),
            mutableListOf(1, 0),
        )
    )
    println(result)
}

private fun countIslandsMax(grid: MutableList<MutableList<Int>>): Int {
    if (grid.isEmpty()) return 0

    val directions = listOf(Pair(1, 0), Pair(-1, 0), Pair(0, 1), Pair(0, -1))
    var max = 0
    var islandId = 2
    val map = mutableMapOf<Int, Int>()

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 1) {
                val size = getIslandSize(grid, i, j, islandId)
                max = max.coerceAtLeast(size)
                map[islandId++] = size
            }
        }
    }

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 0) {
                val set = mutableSetOf<Int>()
                for ((dx, dy) in directions) {
                    val x = i + dx
                    val y = j + dy
                    if (x in grid.indices && y in grid[x].indices && grid[x][y] > 1) {
                        set.add(grid[x][y])
                    }
                }
                var sum = 1
                for (id in set) {
                    sum += map[id] ?: 0
                }
                max = max.coerceAtLeast(sum)
            }
        }
    }
    return max
}

private fun getIslandSize(grid: MutableList<MutableList<Int>>, i: Int, j: Int, islandId: Int): Int {
    if (i !in grid.indices || j !in grid[i].indices || grid[i][j] != 1) {
        return 0
    }
    grid[i][j] = islandId
    return 1 + getIslandSize(grid, i + 1, j, islandId) +
            getIslandSize(grid, i - 1, j, islandId) +
            getIslandSize(grid, i, j + 1, islandId) +
            getIslandSize(grid, i, j - 1, islandId)
}