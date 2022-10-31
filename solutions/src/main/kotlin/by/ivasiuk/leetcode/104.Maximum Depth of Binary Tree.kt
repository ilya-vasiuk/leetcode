package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">
 *   Maximum Depth of Binary Tree</a>
 */
class MaximumDepthOfBinaryTree {
  fun maxDepth(root: TreeNode?): Int =
    root?.let { max(maxDepth(root.left), maxDepth(root.right)) + 1 } ?: 0
}