package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/number-of-enclaves/">Number of Enclaves</a>
 */
class NumberOfEnclaves {
  fun numEnclaves(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val directions = arrayOf(Pair(0, 1), Pair(-1, 0), Pair(1, 0), Pair(0, -1))
    var enclaves = 0
    val queue = LinkedList<Pair<Int, Int>>()

    for (i in 1 until m - 1) {
      for (j in 1 until n - 1) {
        if (grid[i][j] != 0) {
          var enclaveSize = 0
          var isEnclave = true

          queue.offer(Pair(i, j))
          grid[i][j] = 0

          while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()

            if (x !in 1 until m - 1 || y !in 1 until n - 1) {
              isEnclave = false
            } else {
              enclaveSize++
              directions.forEach { (x1, y1) ->
                if (grid[x + x1][y + y1] != 0) {
                  grid[x + x1][y + y1] = 0
                  queue.offer(Pair(x + x1, y + y1))
                }
              }
            }
          }

          if (isEnclave) {
            enclaves += enclaveSize
          }
        }
      }
    }

    return enclaves
  }
}
