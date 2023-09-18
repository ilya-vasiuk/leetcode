package by.ivasiuk.leetcode

import java.util.PriorityQueue

/**
 * @see <a href="https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/">
 *   The K Weakest Rows in a Matrix</a>
 */
class TheKWeakestRowsInAMatrix {
  fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray =
    with(PriorityQueue(compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second })) {
      mat.forEachIndexed { i, row -> offer(row.lastIndexOf(1) to i) }

      return IntArray(k) { poll().second }
    }
}
