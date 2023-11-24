package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/">
 *   Longest ZigZag Path in a Binary Tree</a>
 */
class LongestZigZagPathInABinaryTree {
  fun longestZigZag(root: TreeNode?, toLeft: Boolean = true, steps: Int = 0): Int =
    if (root == null) {
      if (steps > 0) steps - 1 else 0
    } else {
      maxOf(
        longestZigZag(root.left, false, if (toLeft) steps + 1 else 1),
        longestZigZag(root.right, true, if (toLeft) 1 else steps + 1)
      )
    }
}
