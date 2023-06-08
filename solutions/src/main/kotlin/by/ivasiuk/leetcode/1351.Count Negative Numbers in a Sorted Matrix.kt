package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/">
 *   Count Negative Numbers in a Sorted Matrix</a>
 */
class  CountNegativeNumbersInASortedMatrix {
  fun countNegatives(grid: Array<IntArray>): Int {
    var result = 0
    val n = grid[0].size
    var j = n - 1
    for (i in grid.indices) {
      while (j > 0 && grid[i][j] < 0) {
        j--
      }

      result += n - j - if (j == 0 && grid[i][j] < 0) 0 else 1
    }

    return result
  }
}
