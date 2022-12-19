package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/find-if-path-exists-in-graph/">
 *   Find if Path Exists in Graph</a>
 */
class FindIfPathExistsInGraph
{
  fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
    if (source == destination) {
      return true
    }

    val matrix = Array(n) { mutableSetOf<Int>() }
    edges.forEach {
      matrix[it[0]].add(it[1])
      matrix[it[1]].add(it[0])
    }

    val visited = BooleanArray(n)
    val queue = LinkedList<Int>()
    queue.offer(source)

    while (queue.isNotEmpty()) {
      val current = queue.pollFirst()
      visited[current] = true

      for (i in matrix[current]) {
        if (!visited[i]) {
          if (i == destination) {
            return true
          }

          queue.offer(i)
        }
      }
    }

    return false
  }
}
