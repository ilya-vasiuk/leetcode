package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">
 *   Maximum Depth of Binary Tree</a>
 */
class MaximumDepthOfBinaryTree {
  fun maxDepth(root: TreeNode?): Int =
    root?.let { maxOf(maxDepth(root.left), maxDepth(root.right)) + 1 } ?: 0
}