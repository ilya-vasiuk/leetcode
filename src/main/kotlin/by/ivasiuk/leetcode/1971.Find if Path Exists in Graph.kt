package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/find-if-path-exists-in-graph/">
 *   Find if Path Exists in Graph</a>
 */
class FindIfPathExistsInGraph {
  fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
    val visited = BooleanArray(n) { false }.also {
      it[source] = true
    }
    val queue = LinkedList<Int>().apply {
      offer(source)
    }

    while (queue.isNotEmpty()) {
      val current = queue.poll()

      if (current == destination) {
        return true
      }

      for ((u, v) in edges) {
        if (u == current && !visited[v]) {
          queue.offer(v)
          visited[v] = true
        }
        if (v == current && !visited[u]) {
          queue.offer(u)
          visited[u] = true
        }
      }
    }

    return false
  }
}
