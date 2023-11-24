package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/toeplitz-matrix/">
 *   Toeplitz Matrix</a>
 */
class ToeplitzMatrix {
  fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
    for (j in 1 until matrix[0].size) {
      for (i in 1 until matrix.size) {
        if (matrix[i][j] != matrix[i - 1][j - 1]) {
          return false
        }
      }
    }

    return true
  }
}