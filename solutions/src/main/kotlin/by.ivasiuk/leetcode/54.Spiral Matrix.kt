package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/spiral-matrix/">
 *   Spiral Matrix</a>
 */
class SpiralMatrix {
  fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val result = mutableListOf<Int>()
    val m = matrix.size
    val n = matrix[0].size

    var i = 0
    var j = 0
    var direction = Pair(0, 1)

    while (i in 0 until m && j in 0 until n && matrix[i][j] != 101) {
      result.add(matrix[i][j])
      matrix[i][j] = 101

      if (direction.first == 1 && (i == m - 1 || matrix[i + 1][j] == 101)) {
        direction = Pair(0, -1)
      } else if (direction.second == 1 && (j == n - 1 || matrix[i][j + 1] == 101)) {
        direction = Pair(1, 0)
      } else if (direction.first == -1 && (i == 0 || matrix[i - 1][j] == 101)) {
        direction = Pair(0, 1)
      } else if (direction.second == -1 && (j == 0 || matrix[i][j - 1] == 101)) {
        direction = Pair(-1, 0)
      }

      i += direction.first
      j += direction.second
    }

    return result
  }
}