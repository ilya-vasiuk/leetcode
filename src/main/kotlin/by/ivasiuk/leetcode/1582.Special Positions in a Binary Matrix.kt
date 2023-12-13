package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Special Positions in a Binary Matrix</a>
 */
class SpecialPositionsInABinaryMatrix {
  fun numSpecial(mat: Array<IntArray>): Int {
    val rows = IntArray(mat.size)
    val columns = IntArray(mat[0].size)

    for (i in rows.indices) {
      for (j in columns.indices) {
        rows[i] += mat[i][j]
        columns[j] += mat[i][j]
      }
    }

    var result = 0

    for (i in rows.indices) {
      for (j in columns.indices) {
        if (mat[i][j] == 1 && rows[i] == 1 && columns[j] == 1) {
          result++
        }
      }
    }

    return result
  }
}
