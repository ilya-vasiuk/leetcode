package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/">
 *   Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree</a>
 */
class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree {
  fun findCriticalAndPseudoCriticalEdges(n: Int, edges: Array<IntArray>): List<List<Int>> {
    val sorted = edges.indices.sortedWith(compareBy { edges[it][2] })
    val critical = mutableListOf<Int>()
    val pseudo = mutableListOf<Int>()

    fun minSpanTreeW(included: Int = -1, excluded: Int = -1): Int {
      val uf = IntArray(n) { it }

      fun find(x: Int): Int = if (x == uf[x]) x else find(uf[x]).also { uf[x] = it }

      fun union(ind: Int): Int {
        val (a, b, w) = edges[ind]
        return if (find(a) == find(b)) 0 else w.also { uf[find(b)] = find(a) }
      }

      return ((if (included < 0) 0 else union(included)) + sorted
        .filter { it != excluded }.map { union(it) }.sum())
        .takeIf { (0 until n).all { find(0) == find(it) } } ?: Int.MAX_VALUE
    }

    val target = minSpanTreeW()

    edges.indices.forEach {
      if (minSpanTreeW(excluded = it) > target) critical += it
      else if (minSpanTreeW(included = it) == target) pseudo += it
    }

    return listOf(critical, pseudo)
  }
}
