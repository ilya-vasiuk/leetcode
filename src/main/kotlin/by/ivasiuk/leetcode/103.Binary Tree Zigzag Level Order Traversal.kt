package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/">
 *     Binary Tree Zigzag Level Order Traversal</a>
 */
class BinaryTreeZigzagLevelOrderTraversal {
  fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    val levels = mutableMapOf<Int, MutableList<Int>>()

    inspect(root, levels, 0)

    return levels.map { (key, nodes) -> if (key % 2 == 1) nodes.reversed() else nodes }
  }

  private fun inspect(node: TreeNode?, levels: MutableMap<Int, MutableList<Int>>, level: Int) {
    node?.let {
      levels.putIfAbsent(level, mutableListOf())
      levels[level]!!.add(it.`val`)
      inspect(it.left, levels, level + 1)
      inspect(it.right, levels, level + 1)
    }
  }
}
