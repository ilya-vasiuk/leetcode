package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/range-sum-of-bst/">Range Sum of BST</a>
 */
class RangeSumOfBST {
  fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int =
    root?.let {
      (if (root.`val` in low..high) root.`val` else 0) +
        rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
    } ?: 0
}
