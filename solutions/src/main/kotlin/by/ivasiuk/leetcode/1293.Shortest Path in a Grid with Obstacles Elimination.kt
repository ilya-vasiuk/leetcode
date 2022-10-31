package by.ivasiuk.leetcode

import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/">
 *   Shortest Path in a Grid with Obstacles Elimination</a>
 */
class ShortestPathInAGridWithObstaclesElimination {
  fun shortestPath(grid: Array<IntArray>, k: Int): Int {
    val visited =
      Array(grid.size) { Array(grid[0].size) { IntArray(k + 1) { Int.MAX_VALUE } } }
    val result = visit(grid, grid.size - 1, grid[0].size - 1, k, visited)

    return if (result == Int.MAX_VALUE) -1 else result
  }

  private fun visit(
    grid: Array<IntArray>,
    i: Int,
    j: Int,
    k: Int,
    visited: Array<Array<IntArray>>
  ): Int =
    when {
      i !in grid.indices || j !in grid[0].indices || grid[i][j] > 1 -> Int.MAX_VALUE
      i == 0 && j == 0 -> 0
      visited[i][j][k] != Int.MAX_VALUE -> visited[i][j][k]
      grid[i][j] == 1 && k < 1 -> Int.MAX_VALUE
      k >= i + j -> {
        visited[i][j][k] = i + j
        i + j
      }
      else -> {
        val left = if (grid[i][j] == 1) k - 1 else k
        val current = grid[i][j]
        grid[i][j] = 2

        val min = min(
          visit(grid, i - 1, j, left, visited),
          min(
            visit(grid, i, j + 1, left, visited),
            min(
              visit(grid, i + 1, j, left, visited),
              visit(grid, i, j - 1, left, visited)
            )
          )
        )
        grid[i][j] = current
        visited[i][j][left] = if (min == Int.MAX_VALUE) Int.MAX_VALUE else min + 1

        visited[i][j][left]
      }
    }
}