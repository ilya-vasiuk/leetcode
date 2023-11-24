package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/matrix-diagonal-sum/">
 *   Matrix Diagonal Sum</a>
 */
class MatrixDiagonalSum {
  fun diagonalSum(mat: Array<IntArray>): Int {
    val n = mat.size
    val middle = n / 2
    var sum = 0

    for (i in 0 until middle) {
      sum += mat[i][i] + mat[i][n - i - 1] + mat[n - i - 1][i] + mat[n - i - 1][n - i - 1]
    }

    return if (n % 2 == 1) sum + mat[middle][middle] else sum
  }
}
