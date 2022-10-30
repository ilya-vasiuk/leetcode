package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-islands/">
 *    Number of Islands</a>
 */
class NumberOfIslands {
  fun numIslands(grid: Array<CharArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val visited = Array(m) { BooleanArray(n) { false } }
    var islands = 0

    for (i in 0 until m) {
      for (j in 0 until n) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          visit(grid, visited, i, j, m, n)
          islands++
        }
      }
    }

    return islands
  }

  private fun visit(
    grid: Array<CharArray>,
    visited: Array<BooleanArray>,
    i: Int,
    j: Int,
    m: Int,
    n: Int
  ) {
    if (
      i in 0 until m &&
      j in 0 until n &&
      grid[i][j] == '1' &&
      !visited[i][j]
    ) {
      visited[i][j] = true
      visit(grid, visited, i - 1, j, m, n)
      visit(grid, visited, i, j + 1, m, n)
      visit(grid, visited, i + 1, j, m, n)
      visit(grid, visited, i, j - 1, m, n)
    }
  }
}