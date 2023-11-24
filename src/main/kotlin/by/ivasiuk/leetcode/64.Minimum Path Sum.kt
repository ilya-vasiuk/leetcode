package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-path-sum/">Minimum Path Sum</a>
 */
class MinimumPathSum {
  fun minPathSum(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val steps = Array(m) { IntArray(n) }

    for (i in 0 until m) {
      for (j in 0 until n) {
        steps[i][j] = grid[i][j] + when {
          i == 0 && j == 0 -> 0
          i == 0 -> steps[0][j - 1]
          j == 0 -> steps[i - 1][0]
          else -> minOf(steps[i][j - 1], steps[i - 1][j])
        }
      }
    }

    return steps.last().last()
  }
}
