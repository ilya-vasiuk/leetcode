package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/unique-paths/">Unique Paths</a>
 */
class UniquePaths {
  fun uniquePaths(m: Int, n: Int): Int {
    val matrix = Array(m) { IntArray(n) }

    for (i in 0 until m) {
      matrix[i][0] = 1
    }

    for (j in 0 until n) {
      matrix[0][j] = 1
    }

    for (i in 1 until m) {
      for (j in 1 until n) {
        matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1]
      }
    }

    return matrix[m - 1][n - 1]
  }
}
