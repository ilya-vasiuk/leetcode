package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/">
 *   Nearest Exit from Entrance in Maze</a>
 */
class NearestExitFromEntranceInMaze {
  fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
    val n = maze.size
    val m = maze[0].size

    val visited = Array(n) { BooleanArray(m) }
    visited[entrance[0]][entrance[1]] = true

    val queue = LinkedList<Triple<Int, Int, Int>>().also {
      it.offer(Triple(entrance[0], entrance[1], 0))
    }

    while (queue.isNotEmpty()) {
      val (i, j, step) = queue.poll()

      if (step != 0 && (i == 0 || i == n - 1 || j == 0 || j == m - 1)) {
        return step
      }

      if (i > 0 && maze[i - 1][j] == '.' && !visited[i - 1][j]) {
        visited[i - 1][j] = true
        queue.offer(Triple(i - 1, j, step + 1))
      }
      if (j < m - 1 && maze[i][j + 1] == '.' && !visited[i][j + 1]) {
        visited[i][j + 1] = true
        queue.offer(Triple(i, j + 1, step + 1))
      }
      if (i < n - 1 && maze[i + 1][j] == '.' && !visited[i + 1][j]) {
        visited[i + 1][j] = true
        queue.offer(Triple(i + 1, j, step + 1))
      }
      if (j > 0 && maze[i][j - 1] == '.' && !visited[i][j - 1]) {
        visited[i][j - 1] = true
        queue.offer(Triple(i, j - 1, step + 1))
      }
    }

    return -1
  }
}
