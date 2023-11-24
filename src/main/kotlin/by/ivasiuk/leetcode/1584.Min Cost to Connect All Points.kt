package by.ivasiuk.leetcode

import java.util.*
import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/min-cost-to-connect-all-points/">
 *   Min Cost to Connect All Points</a>
 */
class MinCostToConnectAllPoints {
  fun minCostConnectPoints(points: Array<IntArray>): Int {
    if (points.size == 1) {
      return 0
    }

    val queue = PriorityQueue<Pair<Int, IntArray>>(compareBy { it.first })
      .apply { add(0 to points[0]) }
    val visited = mutableSetOf<IntArray>()
    var min = 0

    while (visited.size != points.size) {
      val (dist, point) = queue.poll()

      if (!visited.contains(point)) {
        min += dist
        visited.add(point)

        for (adj in points) {
          if (!adj.contentEquals(point) && !visited.contains(adj)) {
            queue.add(distance(point, adj) to adj)
          }
        }
      }
    }

    return min
  }

  private fun distance(a: IntArray, b: IntArray) =
    abs(a[0] - b[0]) + abs(a[1] - b[1])
}
