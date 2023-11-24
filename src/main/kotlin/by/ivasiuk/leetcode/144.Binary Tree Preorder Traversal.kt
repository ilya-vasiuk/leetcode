package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">
 *   Binary Tree Preorder Traversal</a>
 */
class BinaryTreePreorderTraversal {
  fun preorderTraversal(root: TreeNode?): List<Int> {
    return root?.let {
      listOf(it.`val`) +
          preorderTraversal(it.left) +
          preorderTraversal(it.right)
    } ?: emptyList()
  }
}