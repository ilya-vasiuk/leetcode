package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/largest-color-value-in-a-directed-graph/">
 *   Largest Color Value in a Directed Graph</a>
 */
class LargestColorValueInADirectedGraph {
  fun largestPathValue(colors: String, edges: Array<IntArray>): Int {
    val n = colors.length
    val graph = Array(n) { mutableSetOf<Int>() }
    val inputs = IntArray(n)
    val colorsCount = Array(n) { IntArray(26) }
    val queue = LinkedList<Int>()

    edges.forEach { (from, to) ->
      graph[from].add(to)
      inputs[to]++
    }

    inputs.indices
      .filter { inputs[it] == 0 }
      .forEach { queue.offer(it) }

    var max = 0
    var visitedNodes = 0

    while (queue.isNotEmpty()) {
      val current = queue.poll()
      max = maxOf(max, ++colorsCount[current][colors[current] - 'a'])
      visitedNodes++

      for (next in graph[current]) {
        for (i in 0 until 26) {
          colorsCount[next][i] = maxOf(colorsCount[next][i], colorsCount[current][i])
        }

        if (--inputs[next] == 0) {
          queue.offer(next)
        }
      }
    }

    return if (visitedNodes < n) -1 else max
  }
}
