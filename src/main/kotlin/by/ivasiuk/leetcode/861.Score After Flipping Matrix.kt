package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/score-after-flipping-matrix/">
 *   Score After Flipping Matrix</a>
 */
class ScoreAfterFlippingMatrix {
  fun matrixScore(grid: Array<IntArray>): Int {
    var sum = 0

    for (i in grid[0].indices) {
      val count = grid.indices.sumOf { grid[it][i] xor grid[it][0] }
      sum = sum * 2 + maxOf(count, grid.size - count)
    }

    return sum
  }
}
