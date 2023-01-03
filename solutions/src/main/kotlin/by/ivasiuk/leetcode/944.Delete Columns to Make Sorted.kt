package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/delete-columns-to-make-sorted/">
 *   Delete Columns to Make Sorted</a>
 */
class DeleteColumnsToMakeSorted {
  fun minDeletionSize(strs: Array<String>): Int {
    var columnsToDelete = 0

    for (j in 0 until strs[0].length) {
      for (i in 1 until strs.size) {
        if (strs[i][j] < strs[i - 1][j]) {
          columnsToDelete++
          break
        }
      }
    }

    return columnsToDelete
  }
}
