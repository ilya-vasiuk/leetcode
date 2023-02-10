package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/as-far-from-land-as-possible/">
 *   As Far from Land as Possible</a>
 */
class AsFarFromLandAsPossible {
  fun maxDistance(grid: Array<IntArray>): Int {
    val distance = Array(grid.size) { IntArray(grid.size) { Int.MAX_VALUE } }
    val queue = LinkedList<Triple<Int, Int, Int>>()
    val directions = arrayOf(Pair(-1, 0), Pair(0, 1), Pair(1, 0), Pair(0, -1))

    for (i in grid.indices) {
      for (j in grid.indices) {
        if (grid[i][j] == 1) {
          distance[i][j] = 0
          queue.offer(Triple(i, j, 0))
        }
      }
    }

    while (queue.isNotEmpty()) {
      val (i, j, k) = queue.pop()

      for (d in directions) {
        val x = i + d.first
        val y = j + d.second

        if (x in grid.indices && y in grid.indices && distance[x][y] > k + 1) {
          distance[x][y] = k + 1
          queue.offer(Triple(x, y, k + 1))
        }
      }
    }

    return distance.maxOf { it.max() }
      .takeIf { it != Int.MAX_VALUE && it != 0 } ?: -1
  }
}
