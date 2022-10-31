package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/subtree-of-another-tree/">
 *   Subtree of Another Tree</a>
 */
class SubtreeOfAnotherTree {
  fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean =
    root?.let {
      equals(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    } ?: false

  private fun equals(node1: TreeNode?, node2: TreeNode?): Boolean =
    if (node1 == null && node2 == null) {
      true
    } else {
      node1?.`val` == node2?.`val` && equals(node1?.left, node2?.left) && equals(node1?.right, node2?.right)
    }
}