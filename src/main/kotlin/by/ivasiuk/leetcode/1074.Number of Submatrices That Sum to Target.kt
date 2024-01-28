package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/">
 *   Number of Submatrices That Sum to Target</a>
 */
class NumberOfSubmatricesThatSumToTarget {
  fun numSubmatrixSumTarget(matrix: Array<IntArray>, target: Int): Int {
    val s = Array(matrix.size + 1) { IntArray(matrix[0].size + 1) }

    return (1..<s.size).sumOf { y ->
      (1..<s[0].size).sumOf { x ->
        s[y][x] = matrix[y - 1][x - 1] + s[y - 1][x] + s[y][x - 1] - s[y - 1][x - 1]

        (0..<y).sumOf { y1 ->
          (0..<x).count { x1 ->
            target == s[y][x] - s[y1][x] - s[y][x1] + s[y1][x1]
          }
        }
      }
    }
  }
}
