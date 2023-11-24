package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-increasing-paths-in-a-grid/">
 *   Number of Increasing Paths in a Grid</a>
 */
class NumberOfIncreasingPathsInAGrid {
  fun countPaths(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val visited = Array(m) { LongArray(n) }

    fun visit(i: Int, j: Int): Long {
      if (visited[i][j] > 0) {
        return visited[i][j]
      }

      var sum = 1L

      DIRECTIONS.forEach { (di, dj) ->
        if (i + di in 0 until m && j + dj in 0 until n && grid[i + di][j + dj] > grid[i][j]) {
          sum = (sum + visit(i + di, j + dj)) % MODULO
        }
      }

      visited[i][j] = sum

      return sum
    }

    var result = 0L
    for (i in 0 until m) {
      for (j in 0 until n) {
        result = (result + visit(i, j)) % MODULO
      }
    }

    return result.toInt()
  }


  companion object {
    val DIRECTIONS = setOf(
      Pair(0, 1),
      Pair(0, -1),
      Pair(1, 0),
      Pair(-1, 0),
    )
    const val MODULO = 1_000_000_007
  }
}
