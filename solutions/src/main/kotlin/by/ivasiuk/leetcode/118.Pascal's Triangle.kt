package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">
 *   Merge Sorted Array</a>
 */
class PascalsTriangle {
  fun generate(numRows: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    var prevRow = intArrayOf()

    for (i in 1 until numRows + 1) {
      val currentRow = IntArray(i)
      currentRow[0] = 1
      currentRow[i - 1] = 1

      for (j in 1 until i - 1) {
        currentRow[j] = prevRow[j - 1] + prevRow[j]
      }

      result.add(currentRow.toList())
      prevRow = currentRow.clone()
    }

    return result
  }
}
