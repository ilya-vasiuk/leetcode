package by.ivasiuk.leetcode

import java.util.PriorityQueue

/**
 * @see <a href="https://leetcode.com/problems/path-with-maximum-probability/">
 *   Path with Maximum Probability</a>
 */
class PathWithMaximumProbability {
  fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start: Int, end: Int): Double {
    val graph = mutableMapOf<Int, MutableSet<Pair<Int, Double>>>()
    val visited = BooleanArray(n)

    edges.forEachIndexed { i, (from, to) ->
      graph.computeIfAbsent(from) { mutableSetOf() }.add(Pair(to, succProb[i]))
      graph.computeIfAbsent(to) { mutableSetOf() }.add(Pair(from, succProb[i]))
    }

    val queue = PriorityQueue<Pair<Int, Double>>(compareByDescending { it.second })
    queue.offer(Pair(start, 1.0))

    while (queue.isNotEmpty()) {
      val (node, prob) = queue.poll()
      visited[node] = true

      if (node == end) {
        return prob
      }

      graph[node]?.forEach { (nextNode, nextProb) ->
        if (!visited[nextNode]) {
          queue.offer(Pair(nextNode, prob * nextProb))
        }
      }
    }

    return 0.0
  }
}
