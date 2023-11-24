package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/">
 *   Number of Nodes in the Sub-Tree With the Same Label</a>
 */
class NumberOfNodesInTheSubTreeWithTheSameLabel {
  fun countSubTrees(n: Int, edges: Array<IntArray>, labels: String): IntArray {
    val tree = mutableMapOf<Int, MutableList<Int>>()
    edges.forEach { (start, end) ->
      tree[start] = tree[start]?.apply { add(end) } ?: mutableListOf(end)
      tree[end] = tree[end]?.apply { add(start) } ?: mutableListOf(start)
    }

    val result = IntArray(n) { 1 }

    fun scan(current: Int, parent: Int): Map<Char, Int> {
      val subtree = mutableMapOf(
        labels[current] to 1
      )

      tree[current]
        ?.filter { it != parent }
        ?.map { scan(it, current) }
        ?.forEach { map ->
          map.entries.forEach { (key, value) ->
            subtree.merge(key, value, Int::plus)
          }
        }

      result[current] = subtree[labels[current]]!!

      return subtree
    }

    scan(0, 0)

    return result
  }
}
