package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">
 *   Binary Tree Inorder Traversal</a>
 */
class BinaryTreeInorderTraversal {
  fun inorderTraversal(root: TreeNode?): List<Int> {
    return root?.let {
      inorderTraversal(it.left) +
          it.`val` +
          inorderTraversal(it.right)
    } ?: emptyList()
  }
}