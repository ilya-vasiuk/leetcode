package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/">
 *   Count Unreachable Pairs of Nodes in an Undirected Graph</a>
 */
class CountUnreachablePairsOfNodesInAnUndirectedGraph {
  fun countPairs(n: Int, edges: Array<IntArray>): Long {
    val graph = mutableMapOf<Int, MutableList<Int>>().apply {
      edges.forEach { (from, to) ->
        computeIfAbsent(from) { mutableListOf() }.add(to)
        computeIfAbsent(to) { mutableListOf() }.add(from)
      }
    }
    val visited = BooleanArray(n)
    val queue = LinkedList<Int>()
    var left = n.toLong()
    var result = 0L

    for (i in visited.indices) {
      if (!visited[i]) {
        queue.add(i)
        visited[i] = true
        var size = 0

        while (queue.isNotEmpty()) {
          val current = queue.poll()
          size++

          graph[current]?.forEach {
            if (!visited[it]) {
              queue.offer(it)
              visited[it] = true
            }
          }
        }

        left -= size
        result += left * size
      }
    }

    return result
  }
}
