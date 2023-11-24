package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/path-sum/">
 *   Path Sum</a>
 */
class PathSum {
  fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean =
    root?.let {
      val currentSum = targetSum - it.`val`

      if (currentSum == 0 && root.left == null && root.right == null) {
        true
      } else {
        hasPathSum(it.left, currentSum) || hasPathSum(it.right, currentSum)
      }
    } ?: false
}