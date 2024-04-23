package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-height-trees/">
 *   Minimum Height Trees</a>
 */
class MinimumHeightTrees {
  fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
    val graph = mutableMapOf<Int, MutableList<Int>>()
    val indegree = IntArray(n)

    for ((a, b) in edges) {
      indegree[a]++
      indegree[b]++
      graph.getOrPut(a) { mutableListOf() } += b
      graph.getOrPut(b) { mutableListOf() } += a
    }

    var result = mutableListOf<Int>()

    for (x in 0..<n) {
      if (indegree[x] < 2) {
        result += x
        indegree[x]--
      }
    }

    while (result.size > 1) {
      val next = mutableListOf<Int>()

      for (x in result) {
        for (y in graph[x]!!) {
          indegree[y]--
          if (indegree[y] == 1) {
            next += y
          }
        }
      }

      if (next.size < 1) {
        break
      }

      result = next
    }

    return result
  }
}
