package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/">
 *   Minimum Time to Collect All Apples in a Tree</a>
 */
class MinimumTimeToCollectAllApplesInATree {
  fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int {
    val tree = mutableMapOf<Int, MutableList<Int>>()
    edges.forEach { (start, end) ->
      tree[start] = tree[start]?.apply { add(end) } ?: mutableListOf(end)
      tree[end] = tree[end]?.apply { add(start) } ?: mutableListOf(start)
    }

    return check(0, 0, tree, hasApple)
  }

  private fun check(node: Int, parent: Int, tree: Map<Int, List<Int>>, hasApple: List<Boolean>): Int {
    var childrenSum = 0
    tree[node]
      ?.filter { it != parent }
      ?.forEach {
        childrenSum += check(it, node, tree, hasApple)
      }

    return if (childrenSum > 0 || hasApple[node]) childrenSum + if (node == 0) 0 else 2 else 0
  }
}
