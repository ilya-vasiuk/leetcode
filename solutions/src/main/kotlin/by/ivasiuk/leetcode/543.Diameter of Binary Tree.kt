package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/diameter-of-binary-tree/">
 *   Diameter of Binary Tree</a>
 */
class DiameterOfBinaryTree {
  private var maxDiameter = 0

  fun diameterOfBinaryTree(root: TreeNode?): Int {
    maxDiameter = 0
    root?.let { calcHeight(it) }
    return maxDiameter
  }

  private fun calcHeight(root: TreeNode?): Int =
    root?.let {
      val leftHeight = calcHeight(it.left)
      val rightHeight = calcHeight(it.right)

      maxDiameter = max(leftHeight + rightHeight, maxDiameter)
      max(leftHeight, rightHeight) + 1
    } ?: 0
}