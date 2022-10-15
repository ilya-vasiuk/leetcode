package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/reshape-the-matrix/">
 *   Reshape the Matrix</a>
 */
class ReshapeTheMatrix {
  fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val m = mat.size
    val n = mat[0].size

    if (m * n != r * c) {
      return mat
    }

    val result = Array(r) { IntArray(c) }

    for (i in 0 until r) {
      for (j in 0 until c) {
        result[i][j] = mat[(i * c + j) / n][(i * c + j) % n]
      }
    }

    return result
  }
}