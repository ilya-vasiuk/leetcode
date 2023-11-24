package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/shortest-path-in-binary-matrix/">
 *   Shortest Path in Binary Matrix</a>
 */
class ShortestPathInBinaryMatrix {
  fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
    if (grid[0][0] == 1) {
      return -1
    }

    val m = grid.size
    val n = grid[0].size
    val queue = LinkedList<Triple<Int, Int, Int>>().apply {
      offer(Triple(0, 0, 1))
    }
    val directions = setOf(Pair(1,1), Pair(1,0), Pair(0, 1), Pair(-1, 1), Pair(1, -1), Pair(0, -1), Pair(-1, 0), Pair(-1, -1))

    grid[0][0] = 1
    while (queue.size > 0) {
      val size = queue.size
      for (k in 0 until size) {
        val (i, j, step) = queue.poll()

        if (i == m - 1 && j == n - 1) {
          return step
        } else {
          directions.forEach { (diffI, diffJ) ->
            if (i + diffI in 0 until m && j + diffJ in 0 until n && grid[i + diffI][j + diffJ] == 0) {
              grid[i + diffI][j + diffJ] = 1
              queue.offer(Triple(i + diffI, j + diffJ, step + 1))
            }
          }
        }
      }
    }

    return -1
  }
}