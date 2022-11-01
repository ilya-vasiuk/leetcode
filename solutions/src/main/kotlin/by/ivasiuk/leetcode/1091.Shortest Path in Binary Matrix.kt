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
    val queue = LinkedList<Triple<Int, Int, Int>>()
    queue.push(Triple(0, 0, 1))
    grid[0][0] = 1

    while (queue.size > 0) {
      val (i, j, step) = queue.pollLast()

      if (i == m - 1 && j == n - 1) {
        return step
      } else {
        for (diffI in -1..1) {
          for (diffJ in -1..1) {
            if (diffI != 0 || diffJ != 0) {
              if (i + diffI in 0 until m && j + diffJ in 0 until n && grid[i + diffI][j + diffJ] == 0) {
                grid[i + diffI][j + diffJ] = 1
                queue.push(Triple(i + diffI, j + diffJ, step + 1))
              }
            }
          }
        }
      }
    }

    return -1
  }
}