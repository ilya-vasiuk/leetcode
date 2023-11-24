package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/symmetric-tree/">
 *   Symmetric Tree</a>
 */
class SymmetricTree {
  fun isSymmetric(root: TreeNode?): Boolean {
    return isSymmetric(root, root)
  }

  private fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
    if (left == null && right == null) {
      return true
    }

    return if (left?.`val` == right?.`val`) {
      isSymmetric(left?.left, right?.right) && isSymmetric(left?.right, right?.left)
    } else {
      false
    }
  }
}