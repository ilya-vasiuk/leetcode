package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/">
 *   Difference Between Ones and Zeros in Row and Column</a>
 */
class DifferenceBetweenOnesAndZerosInRowAndColumn {
  fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
    val m = grid.size
    val n = grid[0].size
    val rowOnes = IntArray(m)
    val columnOnes = IntArray(n)

    for (i in 0 until m) {
      for (j in 0 until n) {
        rowOnes[i] += grid[i][j]
        columnOnes[j] += grid[i][j]
      }
    }

    val result = Array(m) { IntArray(n) }

    for (i in rowOnes.indices) {
      for (j in columnOnes.indices) {
        result[i][j] = 2 * rowOnes[i] - m + 2 * columnOnes[j] - n
      }
    }

    return result
  }
}
