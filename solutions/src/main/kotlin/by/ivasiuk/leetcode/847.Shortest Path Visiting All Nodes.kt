package by.ivasiuk.leetcode

import java.util.*
import kotlin.collections.HashSet

/**
 * @see <a href="https://leetcode.com/problems/shortest-path-visiting-all-nodes/">
 *   Shortest Path Visiting All Nodes</a>
 */
class ShortestPathVisitingAllNodes {
  fun shortestPathLength(graph: Array<IntArray>): Int {
    val n = graph.size
    val fullMask = (1 shl n) - 1
    val visited = HashSet<Pair<Int, Int>>()
    val queue = LinkedList<Pair<Int, Int>>()

    for (vertex in graph.indices) {
      val node = vertex to (1 shl vertex)
      queue.offer(node)
      visited.add(node)
    }

    var steps = 0
    while (queue.isNotEmpty()) {
      val size = queue.size

      for (sz in 0 until size) {
        val (vertex, bitMask) = queue.poll()

        if (bitMask == fullMask) {
          return steps
        }

        for (nextVertex in graph[vertex]) {
          val nextNode = nextVertex to (bitMask or (1 shl nextVertex))
          if (visited.add(nextNode)) {
            queue.offer(nextNode)
          }
        }
      }

      ++steps
    }

    return -1
  }
}
