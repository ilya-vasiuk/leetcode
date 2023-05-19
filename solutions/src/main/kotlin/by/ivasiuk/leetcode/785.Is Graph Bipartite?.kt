package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/is-graph-bipartite/">
 *   Is Graph Bipartite?</a>
 */
class IsGraphBipartite {
  fun isBipartite(graph: Array<IntArray>): Boolean {
    val visited = IntArray(graph.size)
    val queue = LinkedList<Pair<Int, Int>>()

    for (i in graph.indices) {
      if (visited[i] == 0) {
        visited[i] = 1
        queue.offer(Pair(i, 1))

        while (queue.isNotEmpty()) {
          val (node, color) = queue.poll()

          for (next in graph[node]) {
            when (visited[next]) {
              color -> return false
              0 -> {
                visited[next] = -color
                queue.offer(Pair(next, -color))
              }
            }
          }
        }
      }
    }

    return true
  }
}
