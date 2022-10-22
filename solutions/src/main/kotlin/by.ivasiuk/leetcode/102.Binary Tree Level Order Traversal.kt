package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">
 *   Binary Tree Level Order Traversal</a>
 */
class BinaryTreeLevelOrderTraversal {
  private val result = mutableListOf<MutableList<Int>>()

  fun levelOrder(root: TreeNode?): List<List<Int>> {
    visit(root, 0)

    return result
  }

  private fun visit(node: TreeNode?, level: Int) {
    if (node != null) {
      if (result.elementAtOrNull(level) != null) {
        result[level].add(node.`val`)
      } else {
        result.add(mutableListOf(node.`val`))
      }
      visit(node.left, level + 1)
      visit(node.right, level + 1)
    }
  }
}