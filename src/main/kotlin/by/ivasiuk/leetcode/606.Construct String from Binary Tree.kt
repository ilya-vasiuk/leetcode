package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/construct-string-from-binary-tree/">
 *   Construct String from Binary Tree</a>
 */
class ConstructStringFromBinaryTree {
  fun tree2str(root: TreeNode?): String =
    when {
      root == null -> ""
      root.left == null && root.right == null -> "${root.`val`}"
      root.right == null -> "${root.`val`}(${tree2str(root.left)})"
      else -> "${root.`val`}(${tree2str(root.left)})(${tree2str(root.right)})"
    }
}
