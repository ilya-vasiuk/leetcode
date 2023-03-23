package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/number-of-operations-to-make-network-connected/">
 *   Number of Operations to Make Network Connected</a>
 */
class NumberOfOperationsToMakeNetworkConnected {
  fun makeConnected(n: Int, connections: Array<IntArray>): Int {
    if (connections.size < n - 1) {
      return -1
    }

    val graph = mutableMapOf<Int, MutableList<Int>>().apply {
      connections.forEach { (from, to) ->
        computeIfAbsent(from) { mutableListOf() }.add(to)
        computeIfAbsent(to) { mutableListOf() }.add(from)
      }
    }
    val visited = BooleanArray(n)
    val queue = LinkedList<Int>()
    var subsets = 0

    for (i in 0 until n) {
      if (!visited[i]) {
        visited[i] = true
        queue.offer(i)
        subsets++

        while (queue.isNotEmpty()) {
          graph[queue.poll()]?.forEach {
            if (!visited[it]) {
              visited[it] = true
              queue.offer(it)
            }
          }
        }
      }
    }

    return subsets - 1
  }
}
