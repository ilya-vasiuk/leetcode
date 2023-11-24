package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/shortest-path-with-alternating-colors/">
 *   Shortest Path with Alternating Colors</a>
 */
class ShortestPathWithAlternatingColors {
  fun shortestAlternatingPaths(n: Int, redEdges: Array<IntArray>, blueEdges: Array<IntArray>): IntArray {
    val res = Array(2) { IntArray(n) { n * 2 }.also { it[0] = 0 } }
    val graph = Array(2) { Array(n) { mutableSetOf<Int>() } }

    redEdges.forEach { (i, j) -> graph[0][i].add(j) }
    blueEdges.forEach { (i, j) -> graph[1][i].add(j) }

    val q = LinkedList<Pair<Int, Int>>()
    q.offer(Pair(0, 0))
    q.offer(Pair(0, 1))

    while (q.isNotEmpty()) {
      val (vert, color) = q.poll()

      for (next in graph[1 - color][vert]) {
        if (res[1 - color][next] == 2 * n) {
          res[1 - color][next] = 1 + res[color][vert]
          q.offer(Pair(next, 1 - color))
        }
      }
    }

    return IntArray(n) { i -> minOf(res[0][i], res[1][i]).takeIf { it != 2 * n } ?: -1 }
  }
}
