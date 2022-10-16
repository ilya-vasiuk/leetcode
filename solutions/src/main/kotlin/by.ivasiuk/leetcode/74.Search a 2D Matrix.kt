package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/">
 *   Search a 2D Matrix</a>
 */
class SearchA2DMatrix {
  fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    for (i in matrix.indices) {
      if (i < matrix.size - 1 && matrix[i + 1][0] < target) continue
      for (j in matrix[i].indices) {
        if (matrix[i][j] == target) {
          return true
        }

        if (matrix[i][j] > target) {
          return false
        }
      }
    }

    return false
  }
}