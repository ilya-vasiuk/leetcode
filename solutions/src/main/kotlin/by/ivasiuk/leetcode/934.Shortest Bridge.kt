package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/shortest-bridge/">
 *   Shortest Bridge</a>
 */
class ShortestBridge {
  private val directions = arrayOf(Pair(0, 1), Pair(1, 0), Pair(0, -1), Pair(-1, 0))

  private fun dfs(grid: Array<IntArray>, i: Int, j: Int, visited: MutableSet<Int>) {
    val curr = i * grid[0].size + j

    if (i in grid.indices && j in grid[0].indices && grid[i][j] == 1 && !visited.contains(curr)) {
      visited.add(curr)

      for ((di, dj) in directions) {
        dfs(grid, i + di, j + dj, visited)
      }
    }
  }

  fun shortestBridge(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size

    var startI = -1
    var startJ = -1
    var found = false

    for (i in 0 until m) {
      if (found) {
        break
      }
      for (j in 0 until n) {
        if (grid[i][j] == 1) {
          startI = i
          startJ = j
          found = true
          break
        }
      }
    }

    val visited = mutableSetOf<Int>()
    dfs(grid, startI, startJ, visited)

    val queue = LinkedList(visited)
    var level = 0

    while (!queue.isEmpty()) {
      val size = queue.size

      for (i in 0 until size) {
        val curr = queue.poll()
        val currI = curr / n
        val currJ = curr % n

        for ((di, dj) in directions) {
          val ni = currI + di
          val nj = currJ + dj
          val neighbor = ni * n + nj

          if (ni in 0 until m && nj in 0 until n && !visited.contains(neighbor)) {
            if (grid[ni][nj] == 1) {
              return level
            }
            queue.offer(neighbor)
            visited.add(neighbor)
          }
        }
      }

      level++
    }

    return -1
  }
}
