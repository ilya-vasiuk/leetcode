package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/invert-binary-tree/">
 *   Invert Binary Tree</a>
 */
class InvertBinaryTree {
  fun invertTree(root: TreeNode?): TreeNode? =
    root?.also {
      val swap = invertTree(it.left)
      it.left = invertTree(it.right)
      it.right = swap
    }
}