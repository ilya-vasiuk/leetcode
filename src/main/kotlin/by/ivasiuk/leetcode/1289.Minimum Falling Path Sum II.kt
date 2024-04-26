package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-falling-path-sum-ii/">Minimum Falling Path Sum II</a>
 */
class MinimumFallingPathSum2 {
  fun minFallingPathSum(grid: Array<IntArray>): Int {
    var minPrev: Int

    for (y in 1 until grid.size) {
      val prev = grid[y - 1]
      val current = grid[y]

      for (x in current.indices) {
        minPrev = Int.MAX_VALUE

        for (x1 in prev.indices) {
          if (x1 != x) {
            minPrev = minOf(minPrev, prev[x1])
          }
        }

        current[x] += minPrev
      }
    }

    return grid.last().min()
  }
}
