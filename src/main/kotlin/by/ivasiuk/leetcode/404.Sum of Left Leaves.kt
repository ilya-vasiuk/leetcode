package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/sum-of-left-leaves/">
 *   Sum of Left Leaves</a>
 */
class SumOfLeftLeaves {
  fun sumOfLeftLeaves(root: TreeNode?, left: Boolean = false): Int =
    root?.let {
      if (root.left == null && root.right == null) {
        if (left) root.`val` else 0
      } else {
        sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right)
      }
    } ?: 0
}
