package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximal-network-rank/">
 *   Maximal Network Rank</a>
 */
class MaximalNetworkRank {
  fun maximalNetworkRank(n: Int, roads: Array<IntArray>): Int {
    val graph = mutableMapOf<Int, HashSet<Int>>().apply {
      roads.forEach { (from, to) ->
        computeIfAbsent(from) { HashSet() } += to
        computeIfAbsent(to) { HashSet() } += from
      }
    }

    var max = 0

    for (i in 0 until n) {
      for (j in i + 1 until n) {
        val countI = graph[i]?.size ?: 0
        val countJ = graph[j]?.size ?: 0
        val direction = if(graph[i] != null && graph[i]!!.contains(j)) 1 else 0

        max = maxOf(max, countI + countJ - direction)
      }
    }

    return max
  }
}
