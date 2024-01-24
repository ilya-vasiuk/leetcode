package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/">
 *   Pseudo-Palindromic Paths in a Binary Tree</a>
 */
class PseudoPalindromicPathsInABinaryTree {
  fun pseudoPalindromicPaths(root: TreeNode?): Int {
    val digits = IntArray(10)
    var result = 0

    fun visit(node: TreeNode?) {
      if (node != null) {
        digits[node.`val`]++

        if (node.left == null && node.right == null && digits.count { it % 2 == 1} < 2)  {
          result++
        }

        visit(node.left)
        visit(node.right)

        digits[node.`val`]--
      }
    }

    visit(root)

    return result
  }
}
