package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-cycle-in-a-graph/">
 *   Longest Cycle in a Graph</a>
 */
class LongestCycleInAGraph {
  fun longestCycle(edges: IntArray): Int {
    val steps = IntArray(edges.size) { 0 }
    var max = -1
    var step = 1

    for (i in edges.indices) {
      if (steps[i] == 0) {
        var current = i
        val start = step

        while (current != -1 && steps[current] == 0) {
          steps[current] = step++
          current = edges[current]
        }

        if (current != -1 && steps[current] >= start) {
          max = maxOf(max, step - steps[current])
        }
      }
    }

    return max
  }
}
