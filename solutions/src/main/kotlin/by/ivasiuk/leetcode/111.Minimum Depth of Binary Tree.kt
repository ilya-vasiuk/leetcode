package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">
 *   Minimum Depth of Binary Tree</a>
 */
class MinimumDepthOfBinaryTree {
  fun minDepth(root: TreeNode?): Int {
    if (root == null) {
      return 0
    }

    var min = Int.MAX_VALUE

    fun findMin(root: TreeNode?, level: Int) {
      if (root != null && level <= min) {
        if (root.left == null && root.right == null && level < min) {
          min = level
        }

        findMin(root.left, level + 1)
        findMin(root.right, level + 1)
      }
    }

    findMin(root, 1)

    return min
  }
}
