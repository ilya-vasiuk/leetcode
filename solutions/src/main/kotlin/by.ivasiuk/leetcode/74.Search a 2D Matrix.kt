package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/">
 *   Search a 2D Matrix</a>
 */
class SearchA2DMatrix {
  fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean =
    searchMatrixBinary(matrix, 0, matrix.size * matrix[0].size, target)

  private fun searchMatrixBinary(matrix: Array<IntArray>, left: Int, right: Int, target: Int): Boolean {
    if (left >= right) {
      return false
    }

    val middle = (right + left) / 2
    val i = middle / matrix[0].size
    val j = middle % matrix[0].size

    return if (matrix[i][j] == target) {
      true
    } else if (matrix[i][j] > target) {
      searchMatrixBinary(matrix, left, middle, target)
    } else {
      searchMatrixBinary(matrix, middle + 1, right, target)
    }
  }
}