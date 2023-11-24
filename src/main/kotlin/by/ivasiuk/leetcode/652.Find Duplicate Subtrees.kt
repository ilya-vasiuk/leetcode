package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/find-duplicate-subtrees/">
 *   Find Duplicate Subtrees</a>
 */
class FindDuplicateSubtrees {
  fun findDuplicateSubtrees(root: TreeNode?): List<TreeNode?> {
    val nodes = mutableMapOf<String, TreeNode>()
    val map = mutableMapOf<String, Int>()

    fun inspect(root: TreeNode?): String? =
      root?.let { node ->
        val hash = "${node.`val`},${inspect(node.left)},${inspect(node.right)}"

        nodes.putIfAbsent(hash, node)
        map[hash] = 1 + (map[hash] ?: 0)

        hash
      }

    inspect(root)

    return map.entries
      .filter { it.value > 1 }
      .map { nodes[it.key] }
  }
}
