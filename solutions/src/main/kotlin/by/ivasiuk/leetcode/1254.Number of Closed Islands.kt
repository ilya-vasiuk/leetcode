package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/number-of-closed-islands/">Number of Closed Islands</a>
 */
class NumberOfClosedIslands {
  fun closedIsland(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val visited = Array(m) { BooleanArray(n) }
    val queue = LinkedList<Pair<Int, Int>>()
    var islands = 0
    val directions = arrayOf(Pair(0, 1), Pair(-1, 0), Pair(1, 0), Pair(0, -1))

    for (i in 1 until m - 1) {
      for (j in 1 until n - 1) {
        if (grid[i][j] == 0 && !visited[i][j]) {
          queue.add(Pair(i, j))
          visited[i][j] = true
          var closed = true

          while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()

            if (x in 1 until m - 1 && y in 1 until n - 1) {
              directions.forEach { (x1, y1) ->
                if (grid[x + x1][y + y1] == 0 && !visited[x + x1][y + y1]) {
                  queue.offer(Pair(x + x1, y + y1))
                  visited[x + x1][y + y1] = true
                }
              }
            } else {
              closed = false
            }
          }

          if (closed) {
            islands++
          }
        }
      }
    }

    return islands
  }
}