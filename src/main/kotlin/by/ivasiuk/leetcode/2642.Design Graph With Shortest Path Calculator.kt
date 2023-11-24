package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Design Graph With Shortest Path Calculator</a>
 */
class Graph(n: Int, edges: Array<IntArray>) {
  private val edges = Array(n) { mutableListOf<Pair<Int, Int>>() }.also {
    edges.forEach { (from, to, distance) ->
      it[from].add(Pair(to, distance))
    }
  }

  fun addEdge(edge: IntArray) {
    edges[edge[0]].add(Pair(edge[1], edge[2]))
  }

  fun shortestPath(start: Int, end: Int): Int {
    val distances = IntArray(edges.size) { Int.MAX_VALUE }.also {
      it[start] = 0
    }
    val queue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second }).also {
      it.offer(Pair(start, 0))
    }

    while (queue.isNotEmpty()) {
      val (node, currentDistance) = queue.poll()

      if (node == end) {
        return currentDistance
      }

      if (currentDistance <= distances[node]) {
        edges[node].forEach { (next, dist) ->
          val distance = currentDistance + dist

          if (distance < distances[next]) {
            distances[next] = distance
            queue.offer(Pair(next, distance))
          }
        }
      }
    }

    return -1
  }
}
