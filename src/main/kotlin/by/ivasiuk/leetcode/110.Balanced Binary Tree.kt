package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.math.abs
import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/balanced-binary-tree/">
 *   Balanced Binary Tree</a>
 */
class BalancedBinaryTree {
  fun isBalanced(root: TreeNode?): Boolean =
    root == null ||
        (abs(getHeight(root.left) - getHeight(root.right)) <= 1 &&
          isBalanced(root.left) && isBalanced(root.right))

  private fun getHeight(node: TreeNode?): Int =
    node?.let { max(getHeight(it.left), getHeight(it.right)) + 1 } ?: 0
}