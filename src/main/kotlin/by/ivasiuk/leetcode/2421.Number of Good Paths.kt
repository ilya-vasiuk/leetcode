package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-good-paths/">
 *   Number of Good Paths</a>
 */
class NumberOfGoodPaths {
  fun numberOfGoodPaths(vals: IntArray, edges: Array<IntArray>): Int {
    var ans = vals.size
    val graph = Array(ans) { mutableListOf<Int>() }
    val valToNodes = mutableMapOf<Int, MutableList<Int>>()
    val unionFind = IntArray(ans) { it }

    fun find(i: Int): Int =
      if (unionFind[i] == i) i else find(unionFind[i]).also { unionFind[i] = it }

    fun union(i: Int, j: Int) {
      unionFind[find(i)] = find(j)
    }

    edges.forEach { (i, j) ->
      if (vals[j] <= vals[i]) {
        graph[i].add(j)
      }
      if (vals[i] <= vals[j]) {
        graph[j].add(i)
      }
    }

    vals.forEachIndexed { i, value ->
      valToNodes.putIfAbsent(value, mutableListOf())
      valToNodes[value]!!.add(i)
    }

    valToNodes.entries.sortedBy { it.key }
      .forEach { (_, nodes) ->
        nodes.forEach { node ->
          graph[node].forEach { next ->
            union(node, next)
          }
        }

        ans += nodes
          .groupingBy { find(it) }
          .eachCount()
          .values
          .sumOf { it * (it - 1) / 2 }
      }

    return ans
  }
}
