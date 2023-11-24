package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/equal-row-and-column-pairs/">
 *   Equal Row and Column Pairs</a>
 */
class EqualRowAndColumnPairs {
  fun equalPairs(grid: Array<IntArray>): Int {
    val map = mutableMapOf<List<Int>, Int>()

    for (j in grid.indices) {
      val current = mutableListOf<Int>()
      for (i in grid.indices) {
        current.add(grid[i][j])
      }

      map[current] = 1 + (map[current] ?: 0)
    }

    return grid.map { map[it.asList()] ?: 0 }.sum()
  }
}
