package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/cherry-pickup-ii/">Cherry Pickup II</a>
 */
class CherryPickup2 {
  fun cherryPickup(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid.first().size
    val cache = mutableMapOf<Triple<Int, Int, Int>, Int>()

    fun dfs(row: Int, c1: Int, c2: Int): Int {
      if (row >= m || c1 !in 0 until n || c2 !in 0 until n) {
        return 0
      }

      return cache.getOrPut(Triple(row, c1, c2)) {
        val curSum = grid[row][c1] + if (c1 != c2) grid[row][c2] else 0

        val result = maxOf(
          dfs(row + 1, c1, c2),
          dfs(row + 1, c1 + 1, c2),
          dfs(row + 1, c1 - 1, c2),
          dfs(row + 1, c1, c2 + 1),
          dfs(row + 1, c1 + 1, c2 + 1),
          dfs(row + 1, c1 - 1, c2 + 1),
          dfs(row + 1, c1, c2 - 1),
          dfs(row + 1, c1 + 1, c2 - 1),
          dfs(row + 1, c1 - 1, c2 - 1)
        ) + curSum

        result
      }
    }

    return dfs(0, 0, grid.first().lastIndex)
  }
}
