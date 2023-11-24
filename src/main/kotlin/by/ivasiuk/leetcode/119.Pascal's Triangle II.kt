package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle-ii/">
 *   Pascal's Triangle II</a>
 */
class PascalsTriangle2 {
  fun getRow(rowIndex: Int): List<Int> {
    if (rowIndex == 0) {
      return listOf(1)
    }

    var previous = listOf(1, 1)
    for (i in 2..rowIndex) {
      val current = mutableListOf(1)

      for (j in 0 until previous.size - 1) {
        current.add(previous[j] + previous[j + 1])
      }

      previous = current + 1
    }

    return previous
  }
}
