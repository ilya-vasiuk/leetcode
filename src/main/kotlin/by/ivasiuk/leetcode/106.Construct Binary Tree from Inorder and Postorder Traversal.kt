package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">
 *   Construct Binary Tree from Inorder and Postorder Traversal</a>
 */
class ConstructBinaryTreeFromInorderAndPostorderTraversal {
  fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
    val inorderIndex = intArrayOf(inorder.size - 1)
    val postorderIndex = intArrayOf(postorder.size - 1)

    fun build(target: Int): TreeNode? =
      if (inorderIndex[0] >= 0 && inorder[inorderIndex[0]] != target) {
        TreeNode(postorder[postorderIndex[0]--]).apply {
          right = build(`val`)
          inorderIndex[0]--
          left = build(target)
        }
      } else null

    return build(Int.MAX_VALUE)
  }
}
