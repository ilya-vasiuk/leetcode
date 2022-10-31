package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/">
 *   Binary Tree Postorder Traversal</a>
 */
class BinaryTreePostorderTraversal {
  fun postorderTraversal(root: TreeNode?): List<Int> {
    return root?.let {
          postorderTraversal(it.left) +
          postorderTraversal(it.right) +
          it.`val`
    } ?: emptyList()
  }
}