package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Transpose Matrix</a>
 */
class TransposeMatrix {
  fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val result = Array(matrix[0].size) { IntArray(matrix.size) }

    for (i in matrix.indices) {
      for (j in matrix[0].indices) {
        result[j][i] = matrix[i][j]
      }
    }

    return result
  }
}
