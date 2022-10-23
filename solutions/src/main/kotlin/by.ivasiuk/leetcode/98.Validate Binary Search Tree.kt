package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/validate-binary-search-tree/">
 *   Validate Binary Search Tree</a>
 */
class ValidateBinarySearchTree {
  fun isValidBST(root: TreeNode?): Boolean =
    isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)

  private fun isValidBST(node: TreeNode?, min: Long, max: Long): Boolean =
    node?.let {
      if (node.`val` >= max || node.`val` <= min) {
        false
      } else {
        isValidBST(node.left, min, node.`val`.toLong()) &&
            isValidBST(node.right, node.`val`.toLong(), max)
      }
    } ?: true
}